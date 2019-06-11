package com.aerotivelabs.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageCenter implements IMessageCenter {

    private List<IClient> clientList;
    private Map<Integer, String> messageHistory;

    public MessageCenter() {
        clientList = new ArrayList<>();
        messageHistory = new HashMap<>();
    }


    @Override
    public void connect(IClient client) {
        clientList.add(client);
        System.out.println("Server Message: Client-" + client.getId() + " has been connected.");
    }

    @Override
    public void disConnect(IClient client) {
        clientList.remove(client);
        System.out.println("Server Message: Client-" + client.getId() + " is disconnected.");
    }

    @Override
    public void publisMessage(int id, String message) {

        clientList.stream()
                .filter(c -> c.getId() != id)
                .forEach(c -> c.onMessageReceived("Client-" + id + " says:" + message));
        messageHistory.put(id, message);
    }
}
