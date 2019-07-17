package com.aerotivelabs.threading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

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
        executorService. invokeAll(callables).stream().map(f -> {
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
