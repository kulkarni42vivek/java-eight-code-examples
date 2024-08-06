package Multithreading;

import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Deadlocking {
    public static void main(String[] args) {
        Lock lock1 =  new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread thread1  = new Thread(()->{
            try{
                lock1.lock();
                System.out.println("The lock1 acquired --> by --> " + Thread.currentThread().getName());
                Thread.sleep(500);

                try{
                    System.out.println("Trying to acquire the lock2 --> " + Thread.currentThread().getName());
                    lock2.lock();
                    System.out.println("The lock2 acquired by the thread --> " + Thread.currentThread().getName());
                }
                finally{
                    lock1.unlock();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock1.unlock();
            }
        });

        Thread thread2  = new Thread(()->{
            try{
                lock2.lock();
                System.out.println("The lock2 acquired --> by --> " + Thread.currentThread().getName());
                Thread.sleep(500);
                try{
                    System.out.println("Trying to acquire the lock1 --> " + Thread.currentThread().getName());
                    lock1.lock();
                    System.out.println("The lock1 acquired by the thread --> " + Thread.currentThread().getName());
                }
                finally{
                    lock1.unlock();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock2.unlock();
            }
        });

        thread1.start();
        thread2.start();
    }
}
