package aero.tav;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        Class personClass = Person.class;
        try {
            Class personClass = Class.forName("aero.tav.Person");
            System.out.println("Canonical Name:" + personClass.getCanonicalName());
            System.out.println("Package Name:" + personClass.getPackage().getName());
            Constructor[] constructors = personClass.getDeclaredConstructors();
            personClass.getDeclaredMethods()
            for (Constructor c : constructors) {
                System.out.println(c.getParameterCount());
                Stream.of(c.getParameterTypes()).forEach(cls -> System.out.println(cls.getName()));
            }
//            Class[] constructorParamTypes = {int.class, String.class, String.class};
//              Person p = (Person) personClassConstructor.newInstance(constructorParams);
//            Constructor personClassConstructor=personClass.getConstructor(constructorParamTypes);
//            Object[] constructorParams = new Object[3];
//            constructorParams[0]=1;
//            constructorParams[1]="Mehmet Gani Tombalak";
//            constructorParams[2]="Developer";
//            Person p = (Person) personClassConstructor.newInstance(constructorParams);
//            System.out.println(p.getName() + " - " + p.getTitle());


            Constructor personClassConstructor=personClass.getConstructor(int.class);
            Person p = (Person) personClassConstructor.newInstance(26);
            System.out.println(p.getId() + ". " + p.getName() + " - " + p.getTitle());


        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


//        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
//        List<Integer> result = new ArrayList<>();
//        List<Integer> synchronizedResultList = Collections.synchronizedList(result);
//
//        //PRODUCER
//        ExecutorService producerExecutorService = Executors.newSingleThreadExecutor();
//        Timer producerTimer = new Timer();
//        producerTimer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                producerExecutorService.submit(new Producer(queue));
//            }
//        },0,10);
//        // CONSUMER
//        ExecutorService consumerExecutorService = Executors.newFixedThreadPool(4);
//        Consumer consumer = new Consumer(queue,consumerExecutorService,synchronizedResultList);
//        consumerExecutorService.execute(consumer);
//
//        //MONITORING
//        Timer monitor = new Timer();
//        monitor.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                try {
//                    System.out.printf("Queue: %s  / Result:%s%n",queue.size(),synchronizedResultList.size());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        },1,4);
//        while(true);


//        String s = "Gani";
//        String g = "Gani";
//        System.out.println(s.hashCode());
//        System.out.println(g.hashCode());
//        System.out.println(s.equals(g));

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("This line written by ANOTHER thread! ID : " + Thread.currentThread().getId());
//            }
//        });
//        t.start();
//        try {
//            t.join(TimeUnit.MILLISECONDS.toMillis(100));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("This line written by MAIN thread! ID : " + Thread.currentThread().getId());

//        List<Double> arr = Arrays.asList(1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D, 9D);
//        System.out.println("Before");
//        arr.forEach(System.out::println);
//        System.out.println("=================================");
//        System.out.println("After");
//        arr.parallelStream().map(n->n*n).forEach(System.out::println);
//        System.out.println("After Party");
//        System.out.println("=================================");
//        arr.stream().forEach(System.out::println);
//        Thread squaredT = new Thread(new Squared(arr));
//        squaredT.start();
//        try {
//            squaredT.join();
//            arr.forEach(System.out::println);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Runnable r = () -> arr.parallelStream().map(n -> n * n).forEach(System.out::println);
//        Thread t = new Thread(r);
//        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
/*Callable<Double> task = ()->{
          try{
              TimeUnit.SECONDS.sleep(3);
          }
          catch (InterruptedException ex){ }
          return 123D;
        };*/
//        ExecutorService executorService= Executors.newSingleThreadExecutor();
//        ExecutorService executorService= Executors.newFixedThreadPool(3);
//        Future<Double> future = executorService.submit(task);
//
//        System.out.println("Thread is done:" + future.isDone());
//
//        try {
//            Double result=future.get(1,TimeUnit.SECONDS);
//            System.out.println("Thread is done:"+ future.isDone());
//            System.out.println("The result is " + result);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        }


    }
}
