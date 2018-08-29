package com.aerotivelabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    private static InetAddress host;
    private static int PORT = 8080;

    public static void main(String[] args) {

        try {
            host = InetAddress.getLocalHost();
            ConnectToServer();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("Connectiong host:port = " + host + ":" + PORT);
    }

    private static void ConnectToServer() {
        Socket socket = null;
        try {
            socket = new Socket(host, PORT);

            BufferedReader streamReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter streamWriter = new PrintWriter(socket.getOutputStream(), true);
            String incomingMessage, outgoingMessage;
            do {
                System.out.print("Enter message:");
                outgoingMessage = consoleReader.readLine();
                streamWriter.println(outgoingMessage);
                incomingMessage = streamReader.readLine();
                System.out.println("Received From Server:" + incomingMessage);

            } while (true);

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
