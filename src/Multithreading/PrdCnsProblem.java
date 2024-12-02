package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Resource{
    int[] array  ;
    int pointer ;
    ReentrantLock lock  = new ReentrantLock();

    Resource(int capacity){
        array = new int[capacity] ;
        pointer = 0;
    }

    public synchronized void produce(int value) throws InterruptedException {

       while (pointer == array.length){
            System.out.println(Thread.currentThread().getName() + " upper breached.");
            wait();
        }
        array[pointer] = value;
        pointer++;
        System.out.println(Thread.currentThread().getName() + " produced --> " + value );
        notifyAll();
    }
    public synchronized void consume() throws InterruptedException {
        while (pointer<=0){
            System.out.println(Thread.currentThread().getName() +  " lower circuit breached.");
            wait();
        }

        System.out.println(Thread.currentThread().getName() +  " "+array[pointer-1] + " --> consumed." );
        pointer--;
        notifyAll();
    }
}
public class PrdCnsProblem {
    public static void main(String[] args) {
        Resource resource = new Resource(5);
        Thread producer = new Thread(() ->{
            for(int i =  0 ;i< 20;i++){
                try {
                    resource.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"PRODUCER ");


        Thread consumer1 = new Thread(() ->{
            for(int i = 0 ;i<10;i++){
                try {
                    resource.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"CONSUMER 1");

        Thread consumer2 = new Thread(() ->{
            for(int i =0 ;i<10;i++){
                try {
                    resource.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"CONSUMER 2 ");

        consumer2.start();
        consumer1.start();
        producer.start();


    }
}
