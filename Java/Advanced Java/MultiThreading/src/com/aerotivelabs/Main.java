package com.aerotivelabs;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
//        List<Integer> results = new ArrayList<>();
//        List<Integer> synchronizedList = Collections.synchronizedList(results);
//
//        ExecutorService producerExecutorService = Executors.newFixedThreadPool(5);
//        ExecutorService consumerExecutorService = Executors.newFixedThreadPool(15);
//        Timer producerTmr = new Timer();
//        producerTmr.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                producerExecutorService.submit(new Producer(queue));
//            }
//        }, 0, 1);
//
//        Consumer main = new Consumer(queue, consumerExecutorService, synchronizedList);
//        consumerExecutorService.execute(main);
//
//        Timer monitor = new Timer();
//        monitor.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.printf("Total:%s%n",
//                        synchronizedList.size());
//            }
//        }, 0, 1000);

//        Callable<Integer> task = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(3);//Thread.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return 456;
//        };
//
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(task);
//        System.out.println("My Thread is completed? :" + future.isDone());
//        Integer result = future.get();
//        System.out.println("My Thread is completed? :" + future.isDone());
//        System.out.println("My Thread result is :" + result);
//        executorService.shutdown();


//        ExecutorService executorService = Executors.newWorkStealingPool();
//        List<Callable<String>> callables = Arrays.asList(
//                CallableGenerator("Gani", 1),
//                CallableGenerator("Emre", 2),
//                CallableGenerator("Erdinc", 3),
//                CallableGenerator("Levent", 4),
//                CallableGenerator("Hasan", 5),
//                CallableGenerator("Sadik", 6),
//                CallableGenerator("Kenan", 7)
//        );
//        executorService.invokeAll(callables).stream().map(f -> {
//            try {
//                return f.get();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return 0;
//            }
//        }).forEach(System.out::println);

    }

    private static Callable<String> CallableGenerator(String result, long sleepTime) {
        return () -> {
            TimeUnit.SECONDS.sleep(sleepTime);
            return result;
        };
    }

}