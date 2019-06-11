package com.aerotivelabs.observer;

public interface IClient {

    int getId();
    void onMessageReceived(String message);
}
