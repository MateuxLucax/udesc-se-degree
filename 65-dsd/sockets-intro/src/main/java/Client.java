import java.io.InputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        System.out.println("Creating connection...");
        try (Socket connection = new Socket("127.0.0.1", 80)) {
            System.out.println("Connected!");
            InputStream response = connection.getInputStream();

            byte[] rawData = new byte[1024];
            int readBytes = response.read(rawData);
            while (readBytes >= 0) {
                String data = new String(rawData, 0, readBytes);
                System.out.println(data);
                readBytes = response.read(rawData);
            }
        } catch (Exception e) {
            System.out.println("Error while connection to host: " + e.getMessage());
        }
    }
}
