package com.aerotivelabs;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> bq;
    private ExecutorService executorService;
    private List<Integer> result;

    public Consumer(BlockingQueue<Integer> blockingQueue, ExecutorService executorService,List<Integer> result) {
        this.bq = blockingQueue;
        this.executorService=executorService;
        this.result=result;
    }

    @Override
    public void run() {
        try {
            while(true){
                int result = this.bq.take();
                executorService.submit(()-> {
                    try {
                        TimeUnit.MICROSECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.result.add(result*result);});
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
