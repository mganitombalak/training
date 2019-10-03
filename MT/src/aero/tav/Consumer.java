package aero.tav;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;
    private ExecutorService executorService;
    private List<Integer> resultList;

    public Consumer(BlockingQueue<Integer> blockingDeque, ExecutorService executorService, List<Integer> resultList) {
        this.blockingQueue = blockingDeque;
        this.executorService = executorService;
        this.resultList = resultList;
    }

    @Override
    public void run() {
        try {
            do {
                int queueItem = blockingQueue.take();
                executorService.submit(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.resultList.add(queueItem * 2);
                });

            } while (true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
