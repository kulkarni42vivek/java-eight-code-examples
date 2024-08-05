package Multithreading;

import java.time.temporal.Temporal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLocking {
    private final ReadWriteLock lock  = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock  = lock.writeLock();

    private int counter  = 0 ;
    public int getCounter(){
        try{
            readLock.lock();
            return counter ;
        }
        finally {
            readLock.unlock();
        }
    }
    public void setCounter(){
        writeLock.lock();
        counter++;
        writeLock.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        ReadWriteLocking obj = new ReadWriteLocking();
        Runnable readTask  = () ->{
            for(int i = 0 ;i< 5;i++){
                System.out.println(Thread.currentThread().getName() + " -- > reading -->  " + obj.getCounter());
            }
        };
        Runnable writeTask  = ()->{
            for(int i = 0 ;i< 5;i++){
                obj.setCounter();
                System.out.println(Thread.currentThread().getName() + " --> value is updated -- > " );
            }
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread  = new Thread(readTask);
        Thread readerThread2  = new Thread(readTask);


        writerThread.start();
        readerThread.start();
        readerThread2.start();


        writerThread.join();
        readerThread.join();
        readerThread2.join();
    }
}
