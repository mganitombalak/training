package com.aerotivelabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private static final int PORT = 8080;
    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        System.out.println("Opening port");
        try {
            serverSocket = new ServerSocket(PORT);
            do {
                listen();
            }
            while(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listen() {
        Socket socket = null;
        try {
            socket = serverSocket.accept();
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter streamWriter = new PrintWriter(socket.getOutputStream(), true);
            while (true) {
                String incomingMessage = socketReader.readLine();
                System.out.print(" Received Message from " + socket.getRemoteSocketAddress() + ":" + incomingMessage);
                streamWriter.println("You sent:" + incomingMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
