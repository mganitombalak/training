package com.aerotivelabs.memento;

public interface IMemento {
    void listen(IStatus object);
    void onChange(OrderState state);
}
