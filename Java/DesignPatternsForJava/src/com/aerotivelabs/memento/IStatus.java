package com.aerotivelabs.memento;

public interface IStatus {
    OrderState getState();
    void setState(OrderState newState);
}
