package com.aerotivelabs.pattern.observer;

public class Main {
    public static void main(String[] args) {
        MessageCenter mc = new MessageCenter();

        MessageClient mc1 = new MessageClient(1,mc);
        MessageClient mc2 = new MessageClient(2,mc);
        MessageClient mc3 = new MessageClient(3,mc);

        mc1.connect();
        mc2.connect();
        mc3.connect();

        mc1.sendMessage("Hey everbody!How is it going?");

        mc2.sendMessage("Hey dude! Awesome!..");

    }
}
