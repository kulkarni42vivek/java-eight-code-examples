package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Example {
    private final Lock lock  = new ReentrantLock();

    public void outerMethod(){

        try{
            System.out.println("inner the lock "+ Thread.currentThread().getName());
            lock.lock();
            innerMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
            lock.unlock();
        }
    }

    private void innerMethod() throws InterruptedException {
        lock.lock();
        System.out.println("inner method invocation ");
        Thread.sleep(300);
        lock.unlock();
    }
}

public class ReentrantLockInner {
    public static void main(String[] args) {
        Example ex  = new Example();
        Runnable runnable  = new Runnable() {
            @Override
            public void run() {
                ex.outerMethod();
            }
        };
        Thread thread  = new Thread(runnable);
        thread.start();
    }
}
