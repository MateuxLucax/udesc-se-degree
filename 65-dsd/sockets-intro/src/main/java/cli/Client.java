package cli;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Creating connection...");
            try (Socket connection = new Socket("127.0.0.1", 80)) {
                System.out.println("Connected!");
                DataOutputStream request = new DataOutputStream(connection.getOutputStream());
                BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

                String text;
                while ((text = response.readLine()) != null) {
                    System.out.println(text);
                    if (text.equals("Connection closed")) break;
                    String body = keyboard.readLine();
                    request.writeBytes(body + "\n");
                }

                request.close();
                response.close();
                keyboard.close();
            } catch (Exception e) {
                System.out.println("Error while connection to host: " + e.getMessage());
                break;
            }
        }
    }
}

