package com.aerotivelabs;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("This text is written by another thread");
//            }
//        });
//        new Thread(() -> System.out.println("Second Thread.")).start();
//        t.start();
//
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        List<Double> arr = Arrays.asList(1D,2D,3D,4D,5D,6D,7D,8D,9D);

//        arr.stream().map(n->n*n).forEach(System.out::println);

//        System.out.println("Before");
//        arr.forEach(n->System.out.print(n+","));
//        System.out.printf("%nAfter%n");
//        Thread t = new Thread(new Squared(arr));
//        t.start();
//        t.join();
//        arr.forEach(n->System.out.print(n+","));


//        System.out.println(c.getValue());

        final List<Person> personList = Arrays.asList(
                new Person(1, "Gani"),
                new Person(2, "Emre"),
                new Person(3, "Erdinc"),
                new Person(4, "Levent"),
                new Person(5, "Hasan"),
                new Person(6, "Sadik"),
                new Person(7, "Kenan"),
                new Person(8, "Ilhami"),
                new Person(9, "Gul"),
                new Person(10, "Ozge")
        );
//
//        Runnable r1 = () -> personList.parallelStream().forEach(Person::print);
//
//        Thread t1 = new Thread(r1);
//
//        t1.start();

        //RUNNABLE
//        Runnable r1 = () -> personList.forEach(Person::print);
//
//        Thread t1 = new Thread(r1);
//            t1.start();
//        Runnable r2 = () -> {
//            Consumer<Person> style=(Person p)-> System.out.println("Person Id:"+p.id + " name:" + p.name);
//            personList.forEach(style);
//        };
//        t1.join();
//        Thread t2= new Thread(r2);
//        t2.start();
//        t2.join();

        //EXECUTOR SERVICE
//        ExecutorService executorService =Executors.newFixedThreadPool(2);
//        Runnable r1 = () -> personList.forEach(Person::print);
//        executorService.execute(r1);
//        Runnable r2 = () -> {
//            Consumer<Person> style=(Person p)-> System.out.println("Person Id:"+p.id + " name:" + p.name);
//            personList.forEach(style);
//        };
//        executorService.execute(r2);


//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.submit(()->{
//            try {
//                Thread.sleep(3000);
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
 //       executorService.awaitTermination(2000,TimeUnit.MILLISECONDS);
//        executorService.shutdown();
//        executorService.shutdownNow();


//        CALLABLE
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(3);//Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 456;
        };

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(task);
//        System.out.println("My Thread is completed? :" + future.isDone());
//        Integer result = future.get();
//        System.out.println("My Thread is completed? :" + future.isDone());
//        System.out.println("My Thread result is :" + result);
//        executorService.shutdown();

//        ExecutorService executorService =Executors.newFixedThreadPool(1);
//        Future<Integer> future= executorService.submit(task);
//        future.get(1,TimeUnit.SECONDS);
//        executorService.shutdown();

        ExecutorService executorService = Executors.newWorkStealingPool();
        List<Callable<String>> callables = Arrays.asList(
                CallableGenerator("Gani", 1),
                CallableGenerator("Emre", 2),
                CallableGenerator("Erdinc", 3),
                CallableGenerator("Levent", 4),
                CallableGenerator("Hasan", 5),
                CallableGenerator("Sadik", 6),
                CallableGenerator("Kenan", 7)
        );
        executorService.invokeAll(callables).stream().map(f -> {
            try{
            return f.get();
            } catch (Exception e){
                e.printStackTrace();
                return 0;
            }
        }).forEach(System.out::println);
    }



    private static Callable<String> CallableGenerator(String result, long sleepTime) {
        return () -> {
            TimeUnit.SECONDS.sleep(sleepTime);
            return result;
        };
    }
}

