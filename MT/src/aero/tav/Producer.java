package aero.tav;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        int random = (int)(Math.random()*9) +1;
        try{
            blockingQueue.put(random);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
