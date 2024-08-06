package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter3 {
    private AtomicInteger count = new AtomicInteger(0);

    public  void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

public class Atomicuse {
    public static void main(String[] args) throws InterruptedException {
        Counter3 counter = new Counter3();
        Thread thread = new Thread(()->{
            for(int i = 0 ;i<100000;i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i = 0 ;i<100000;i++) {
                counter.increment();
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter.getCount());

    }
}