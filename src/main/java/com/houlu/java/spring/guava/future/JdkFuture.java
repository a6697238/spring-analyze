package com.houlu.java.spring.guava.future;

import java.util.concurrent.*;

/**
 * @author Lu Hou
 * @date 2017/10/4
 * @time 下午3:12
 */
public class JdkFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":finish");
                return null;
            }
        });
        future.get();
        System.out.println("finish");

    }
}
