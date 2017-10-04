package com.houlu.java.spring.guava.future;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/**
 * @author Lu Hou
 * @date 2017/10/4
 * @time 下午3:16
 */
public class GuavaFuture {

    public static void main(String[] args) throws InterruptedException {

        ListeningExecutorService pool = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(3));

        ListenableFuture<String> listenableFuture = pool.submit(new Callable<String>() {
            public String call() throws Exception {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ":finish");
                throw new RuntimeException("aa");
//                return "Guava Listening future result";
            }
        });

        Futures.addCallback(listenableFuture, new FutureCallback<String>() {
            public void onSuccess(String s) {
                System.out.println(s);
            }

            public void onFailure(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }
        });

        Thread.sleep(10000);
    }
}
