package com.aerotivelabs.pattern.memento;


public interface IStatus {
    OrderState getState();
    void setState(OrderState newState);
}
