import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Application {

    public static void main(String[] args) throws Exception {
        Arguments arguments = loadArguments(args);
        if (arguments.exportLogs) {
            initLogger(arguments);
        }

        if (arguments.threadsNumber > 1) {
            runMultithreaded(arguments);
        } else {
            runWithoutThreads(arguments);
        }

        System.exit(0);
    }

    private static void runMultithreaded(Arguments arguments) throws Exception {
	System.out.println("Running multithreaded!");
	List<List<File>> sublist = generateSubLists(loadFiles(arguments.wordsFolder), arguments.threadsNumber);

        int totalTime = 0;
        for (int run = 0; run < arguments.runs; run++) {
            System.out.printf("Run %d out of %d.%n", (run + 1), arguments.runs);
            long startTime = System.currentTimeMillis();
            List<Result> results = runTasksMultithreaded(arguments, sublist);
            totalTime += checkResults(arguments, results);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            System.out.printf("Run %d took %dms to complete.%n", (run + 1), elapsedTime);
            System.out.println();
        }

        System.out.printf("Total time: %dms. Average: %dms.%n", totalTime, (totalTime / arguments.runs));
    }

    public static void runWithoutThreads(Arguments arguments) throws Exception {
	    System.out.println("Running without threads! (ignore thread number on result)");

        List<File> files = loadFiles(arguments.wordsFolder);
        int totalTime = 0;
        for (int run = 0; run < arguments.runs; run++) {
            System.out.printf("Run %d out of %d.%n", (run + 1), arguments.runs);;
            Result result = new ProcessFiles(files, 0, arguments.search).call();
            totalTime += checkResults(arguments, List.of(result));
            System.out.println();
        }

        System.out.printf("Total time: %dms. Average: %dms.%n", totalTime, (totalTime / arguments.runs));
    }

    private static Arguments loadArguments(String[] args) throws Exception {
        if (args.length != 5) {
            throw new Exception("Invalid arguments");
        }

        return new Arguments(
            args[0],
            args[1],
            Integer.parseInt(args[2]),
            Integer.parseInt(args[3]),
            args[4].equals("true")
        );
    }

    private static List<File> loadFiles(String folderPath) throws Exception {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            //noinspection ConstantConditions
            return List.of(folder.listFiles());
        } else {
            throw new Exception("Folder not found");
        }
    }

    private static List<List<File>> generateSubLists(List<File> files, int numberOfThreads) {
        int minItemsPerThread = files.size() / numberOfThreads;
        int maxItemsPerThread = minItemsPerThread + 1;
        int threadsWithMaxItems = files.size() - numberOfThreads * minItemsPerThread;
        int start = 0;
        final List<List<File>> sublist = new ArrayList<>(numberOfThreads);
        for (int i = 0; i < numberOfThreads; i++) {
            int itemsCount = (i < threadsWithMaxItems ? maxItemsPerThread : minItemsPerThread);
            int end = start + itemsCount;
            int finalStart = start;
            sublist.add(files.subList(finalStart, end));
            start = end;
        }

        return sublist;
    }

    private static List<Future<Result>> processWords(Arguments arguments, List<List<File>> subList) {
        ExecutorService executor = Executors.newFixedThreadPool(arguments.threadsNumber);
        List<Future<Result>> futures = new ArrayList<>(arguments.threadsNumber);
        for (int i = 0; i < arguments.threadsNumber; i++) {
            Callable<Result> processFileThread = new ProcessFiles(subList.get(i), i, arguments.search);
            futures.add(executor.submit(processFileThread));
        }

        return futures;
    }

    private static List<Result> runTasksMultithreaded(Arguments arguments, List<List<File>> sublist) throws ExecutionException, InterruptedException {
        List<Result> results = new ArrayList<>(arguments.threadsNumber);
        for (Future<Result> future : processWords(arguments, sublist)) {
            results.add(future.get());
        }

        return results;
    }

    public static int checkResults(Arguments arguments, List<Result> results) {
        int total = 0;
        int totalFiles = 0;
        int totalTime = 0;
        for (Result result : results) {
            total += result.count;
            totalFiles += result.filesNumber;
            totalTime += result.time;
            System.out.printf("Thread %d processed %d files with a total of %d lines in: %dms.%n", result.thread, result.filesNumber, result.numberOfLines, result.time);
        }
        System.out.printf("found %s %d times on %d files.%n", arguments.search, total, totalFiles);

        return totalTime / results.size();
    }

    public record Result(int count, long time, int thread, int filesNumber, int numberOfLines) {}

    public record Arguments(String wordsFolder, String search, int threadsNumber, int runs, boolean exportLogs) {}

    public static void initLogger(Arguments arguments) throws IOException {
        File logsFolder = new File("logs");
        if (!logsFolder.exists()) {
            logsFolder.mkdir();
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        File logsFile = new File(
            String.format(
                "logs/result-search-%s-threads-%d-runs-%d-%s.log",
                arguments.search,
                arguments.threadsNumber,
                arguments.runs,
                formatter.format(now)
            )
        );
        logsFile.createNewFile();
        PrintStream printStream = new PrintStream(logsFile);
        System.setOut(printStream);
    }

    private record ProcessFiles(List<File> files, int thread, String search) implements Callable<Result> {
        @Override
        public Result call() {
            long begin = System.currentTimeMillis();
            int count = 0;
            int linesNumber = 0;
            List<File> threadFiles = files;
            for (File file : threadFiles) {
                try {
                    for (String word : Files.readAllLines(Path.of(file.getPath()))) {
                        if (word.equals(search)) {
                            count++;
                        }
                        linesNumber++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            long finish = System.currentTimeMillis();
            long totalTime = finish - begin;
            return new Result(count, totalTime, (thread + 1), threadFiles.size(), linesNumber);
        }
    }
}
