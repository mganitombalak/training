package com.aerotivelabs;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Integer> bq;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.bq = blockingQueue;
    }

    @Override
    public void run() {
        int range = (1 - 9) + 1;
        int random = (int) (Math.random() * range) + 1;
        try {
            this.bq.put(random);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
