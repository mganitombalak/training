package com.aerotivelabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class UDPClient {
    private static InetAddress host;
    private static final int PORT = 4445;
    private static DatagramSocket socket;
    private static DatagramPacket incomingPackage, outgoingPackage;
    private static byte[] buffer;

    public static void main(String[] args) {

        try {
            host = InetAddress.getLocalHost();
            StartClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void StartClient() {
        try {
            socket = new DatagramSocket();
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.print("Enter your message:");
                String outgoingMessage = consoleReader.readLine();
                outgoingPackage = new DatagramPacket(
                        outgoingMessage.getBytes(),
                        0,
                        outgoingMessage.length(),
                        host,
                        PORT);
                socket.send(outgoingPackage);
                buffer = new byte[256];
                incomingPackage = new DatagramPacket(buffer, buffer.length);
                socket.receive(incomingPackage);
                System.out.print("Server response:" +
                        new String(incomingPackage.getData(), 0, incomingPackage.getLength()));
            }
            while (true);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();

        }
    }
}
