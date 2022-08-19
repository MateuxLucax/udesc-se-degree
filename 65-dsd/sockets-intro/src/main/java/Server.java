import java.io.BufferedReader;
import java.io.InputStream;
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
                    connection.
                    System.out.println("Connected with " + connection.getInetAddress().getHostAddress());

                    OutputStream response = connection.getOutputStream();
                    String message = "Hello world!";
                    response.write(message.getBytes());

                    BufferedReader in =
                            new BufferedReader(
                                    new InputStreamReader(connection.getInputStream()));
                    String fromServer = in.readLine();
                    System.out.println(fromServer);
//                    InputStream response2 = connection.getInputStream();
//
//                    byte[] rawData = new byte[1024];
//                    int readBytes = response2.read(rawData);
//                    while (readBytes >= 0) {
//                        String data = new String(rawData, 0, readBytes);
//                        System.out.println(data);
//                        readBytes = response2.read(rawData);
//                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Could not start server due to: " + e.getMessage());
        }
    }
}
