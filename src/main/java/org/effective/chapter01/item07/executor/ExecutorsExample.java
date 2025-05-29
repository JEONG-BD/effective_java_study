package org.effective.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        // 리소스
        int numberOfCpu = Runtime.getRuntime().availableProcessors();
        //ExecutorService service = Executors.newCachedThreadPool();
        //ExecutorService service = Executors.newScheduledThreadPool();
        ExecutorService service = Executors.newFixedThreadPool(10);
        // Blocking Queue
        for (int i = 0; i < 100 ; i++) {
            service.submit(new Task());
        }

        service.shutdown();

        //for (int i = 0; i < 100 ; i++) {
        //    Thread thread = new Thread(new Task());
        //    thread.start();
        //}

        //Thread thread = new Thread(new Task());
        //thread.start();
        //System.out.println(Thread.currentThread().getName() + " hello");'

        //non blocking
        Future<String> submit = service.submit(new Task2());
        //blocking
        submit.get();
    }
    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " world");
        }
    }
    static class Task2 implements Callable<String> {

        @Override
        public String call() throws Exception{
            Thread.sleep(2000);
             return Thread.currentThread().getName() + " world";
        }
    }
}
