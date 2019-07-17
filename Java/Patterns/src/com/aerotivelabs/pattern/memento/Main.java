package com.aerotivelabs.pattern.memento;

public class Main {
    public static void main(String[] args) {
        Memento mem = new Memento();
        Order myOrder = new Order(mem);

        myOrder.setState(OrderState.PreAuthorized);
        System.out.println(myOrder.getState());

        myOrder.setState(OrderState.Confirmed);
        System.out.println(myOrder.getState());

        mem.Undo();
        System.out.println(myOrder.getState());

        mem.Undo();
        System.out.println(myOrder.getState());
    }
}
