package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    int balance = 100;
    private Lock lock  = new ReentrantLock();
    public void withDraw(int money){
        try{
            lock.lock();

            System.out.println(Thread.currentThread().getName() + " --> " + "attempting withdrawl --> " + money);
            if(balance >=money) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.balance  = this.balance - money;
                System.out.println(Thread.currentThread().getName() + "Completed withdrawl--> " + this.balance  );
            }        
            else{
                System.out.println("failed insufficient balance");
            }
        }
        finally{
            lock.unlock();
        }
        
    }
    public int getMoney(){
        return this.balance;
    }
}
public class ReentractLocking {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bank  = new BankAccount();
        Runnable task  = new Runnable() {
            public void run(){
                bank.withDraw(5);
            }
        };

        Thread t1 = new Thread(task , "thraed 1");
        Thread t2 = new Thread(task , "thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(bank.getMoney());

    }
}
