package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccountTWO{
    int balance = 1000;
    private Lock lock  = new ReentrantLock();
    public void withDraw(int money) throws InterruptedException{
        System.out.println(Thread.currentThread().getName() + " --> " + "attempting withdrawl --> " + money);
        try{
           if(lock.tryLock(3000 , TimeUnit.MILLISECONDS)){
                if(balance >=money) {
                    try {
                        Thread.sleep(6000);
                        this.balance  = this.balance - money;
                        System.out.println( Thread.currentThread().getName() + "Completed withdrawl--> " + this.balance  );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally{
                        lock.unlock();
                    }
                }        
                else{
                    System.out.println("failed insufficient balance");
                }
           }
           else{
                System.out.println(Thread.currentThread().getName() + " -- >Could not acquire the lock ");
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class ReentrantTryLock {
    public static void main(String[] args) {
    	BankAccountTWO bank  = new BankAccountTWO();
        Runnable task  = new Runnable() {
            public void run(){
                try {
                    bank.withDraw(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task , "thraed 1");
        Thread t2 = new Thread(task , "thread 2");

        t1.start();
        t2.start();

    }
}
