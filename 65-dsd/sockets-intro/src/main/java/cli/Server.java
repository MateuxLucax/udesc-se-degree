package cli;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Server {

    public static String FINISH_MESSAGE = "--finish--";
    public static String CLOSED_MESSAGE = "Connection closed";

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(80)) {
            server.setReuseAddress(true);

            while (true) {
                System.out.println("Awaiting connection...");
                try (Socket connection = server.accept()) {
                    handleConnection(connection);
                } catch (Exception e) {
                    System.out.println("Error while handling connection. " + e.getMessage());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Could not start server due to: " + e.getMessage());
        }
    }

    public static void handleConnection(Socket connection) throws IOException {
        try (
            PrintWriter out = new PrintWriter(connection.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        ) {
            System.out.println("Connected with " + connection.getInetAddress().getHostAddress());
            out.println("Connected on " + System.getProperty("os.name") + ". Please type a CLI command for this OS, or exit to close connection." + "\n" + FINISH_MESSAGE);
            String command;
            while ((command = in.readLine()) != null) {
                if (command.equals("exit")) break;
                try {
                    String result = handleCommand(command);
                    System.out.println(result);
                    out.println(result + "\n" + FINISH_MESSAGE);
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            }
            out.println(CLOSED_MESSAGE);

            connection.close();
        }
    }

    public static String handleCommand(String command) throws IOException {
        Process process = Runtime.getRuntime().exec(command);
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }

        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        while ((line = errorReader.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }

        errorReader.close();
        reader.close();
        process.destroy();

        return String.join("\n", lines);
    }
}
