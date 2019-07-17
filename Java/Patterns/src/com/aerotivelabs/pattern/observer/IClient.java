package com.aerotivelabs.pattern.observer;

public interface IClient {

    int getId();
    void onMessageReceived(String message);
}
