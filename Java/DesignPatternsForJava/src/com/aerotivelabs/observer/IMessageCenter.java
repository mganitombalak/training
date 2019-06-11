package com.aerotivelabs.observer;

public interface IMessageCenter {
    void connect(IClient client);
    void disConnect(IClient client);
    void publisMessage(int id,String message);
}
