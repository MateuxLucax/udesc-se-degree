package cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(80)) {
            server.setReuseAddress(true);

            while (true) {
                System.out.println("Awaiting connection...");
                try (Socket connection = server.accept()) {
                    handleConnection(connection);
                } catch (Exception e) {
                    System.out.println("Error while handling connection. " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Could not start server due to: " + e.getMessage());
        }
    }

    public static void handleConnection(Socket connection) throws IOException {
        PrintStream response = new PrintStream(connection.getOutputStream());
        response.flush();
        System.out.println("Connected with " + connection.getInetAddress().getHostAddress());
        response.printf("Connected on %s. Please type a CLI command for this OS, or exit to close connection.%n", System.getProperty("os.name"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String command;
        while ((command = reader.readLine()) != null) {
            if (command.equals("exit")) break;
            try {
                String result = handleCommand(command);
                System.out.println(result);
                response.println(result);
            } catch (Exception e) {
                response.println(e.getMessage());
            }
        }
        response.println("Connection closed");

        reader.close();
        response.close();
        connection.close();
    }

    public static String handleCommand(String command) throws IOException {
        Process process = Runtime.getRuntime().exec(command);
        StringBuilder response = new StringBuilder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line).append("\n");
        }

        process.getOutputStream();
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        while ((line = errorReader.readLine()) != null) {
            System.out.println(line);
            response.append(line);
        }

        errorReader.close();
        reader.close();
        process.destroy();

        return response.toString();
    }
}
