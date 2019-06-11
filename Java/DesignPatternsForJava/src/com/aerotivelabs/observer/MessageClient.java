package com.aerotivelabs.observer;

public class MessageClient implements IClient {
    private int id;
    private IMessageCenter messageCenter;

    public MessageClient(int id, IMessageCenter messageCenter) {

        this.id = id;
        this.messageCenter = messageCenter;
    }

    @Override
    public int getId() {
        return id;
    }

    public void connect() {
        messageCenter.connect(this);
    }

    public void disConnect() {
        messageCenter.disConnect(this);
    }

    @Override
    public void onMessageReceived(String message) {
        System.out.println("Server Response (" + this.id + "):" + message);
    }

    public void sendMessage(String message) {
        messageCenter.publisMessage(this.id, message);
    }
}
