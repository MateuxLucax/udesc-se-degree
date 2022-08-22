import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(80)) {
            server.setReuseAddress(true);

            while (true) {
                System.out.println("Awaiting connection...");
                try (Socket connection = server.accept()) {
                    System.out.println("Connected with " + connection.getInetAddress().getHostAddress());

                    OutputStream response = connection.getOutputStream();
                    String message = "Hello world!";
                    response.write(message.getBytes());
                }
            }
        } catch (Exception e) {
            System.out.println("Could not start server due to: " + e.getMessage());
        }
    }
}
