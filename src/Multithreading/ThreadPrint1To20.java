package Multithreading;

import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ThreadPrint1To20 {
    private static Lock lock = new ReentrantLock();
    private static int start = 1;
    private static int end = 11;

    public static void main(String[] args) {

        Thread thread1 = new Thread(()->{
            printEvenNumbers();
        });
        Thread thread2 = new Thread(()->{
            printOddNumbers();
        });

        thread1.start();
        thread2.start();


    }

    private static void printOddNumbers() {

        lock.lock();
            while (start <= end) {
                while (start % 2 == 1) {
                    System.out.println(	Thread.currentThread().getId() +" "+ start);
                    start++;
                    lock.notify();
                }
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        lock.unlock();

    }

    private static void printEvenNumbers() {

       lock.lock();
            while (start <= end) {
                while (start % 2 == 0) {
                    System.out.println(	Thread.currentThread().getId() +" " +start);
                    start++;
                    lock.notify();
                }
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        lock.unlock();

    }
}
