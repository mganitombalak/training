package com.aerotivelabs.pattern.memento;

public interface IMemento {
    void listen(IStatus object);
    void onChange(OrderState state);
}
