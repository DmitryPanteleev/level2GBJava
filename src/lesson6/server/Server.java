package lesson6.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public void StartServer() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server start, waiting connection...");
            socket = serverSocket.accept();
            System.out.println("Connection");
            Scanner sc = new Scanner(socket.getInputStream());
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str = sc.nextLine();
                if (str.equals("end")) break;
                pw.println("echo: " + str);
                pw.flush();
            }
        } catch (IOException e) {
            System.out.println("Exception server initializer");
        }finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
