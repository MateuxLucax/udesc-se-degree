package cli;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Creating connection...");
        try (Socket connection = new Socket("127.0.0.1", 80)) {
            System.out.println("Connected!");

            try (
                DataOutputStream out = new DataOutputStream(connection.getOutputStream());
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            ) {
                process(out, in, keyboard);
            }
        } catch (Exception e) {
            System.out.println("Error while connection to host: " + e.getMessage());
        }
    }

    public static void process(DataOutputStream out, BufferedReader in, BufferedReader keyboard) throws IOException {
        StringBuilder response = new StringBuilder();
        for (String line; (line = in.readLine()) != null;) {
            if (line.equals(Server.FINISH_MESSAGE)) break;
            System.out.println(line);
            response.append(line);
        }

        if (response.toString().equals("Connection closed")) return;
        String body = keyboard.readLine();
        out.writeBytes(body + "\n");
        process(out, in, keyboard);
    }

}

