package com.aerotivelabs;

import java.io.IOException;
import java.net.*;

public class UDPServer {

    private static final int PORT = 4445;
    private static DatagramSocket socket;
    private static DatagramPacket incomingPacket, outgoingPacket;
    private static byte[] buffer;

    public static void main(String[] args) {
        System.out.println("Opening port:" + PORT);
        try {
            socket = new DatagramSocket(PORT);
            listen();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public static void listen() {
        buffer = new byte[256];
        incomingPacket = new DatagramPacket(buffer, buffer.length);
        try {
            do {
                socket.receive(incomingPacket);
                InetAddress clientAddr = incomingPacket.getAddress();
                int clientPort = incomingPacket.getPort();
                System.out.println("Client:" + clientAddr + " at port " + clientPort);
                String incomingMessage = new String(
                        incomingPacket.getData(),
                        0,
                        incomingPacket.getLength());
                System.out.println("Data:" + incomingMessage);
                String outgoingMessage = "You sent " + incomingMessage;
                outgoingPacket = new DatagramPacket(outgoingMessage.getBytes(),
                        outgoingMessage.length(),
                        clientAddr,
                        clientPort);
                socket.send(outgoingPacket);
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }

    }
}
