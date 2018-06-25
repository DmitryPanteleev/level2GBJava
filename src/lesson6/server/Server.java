package lesson6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void StartServer() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server start, waiting connection...");
            socket = serverSocket.accept();
            System.out.println("Connection");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String str = inputStream.readUTF();
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                if (str.equals("end")) break;
                outputStream.writeUTF(str + "\n");
                outputStream.flush();
//                outputStream.writeUTF(inputStream.readUTF() + "\n");

            }
        } catch (IOException e) {
            System.out.println("Exception Server initializer");
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
