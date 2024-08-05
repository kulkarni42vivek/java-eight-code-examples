package Multithreading;

class Thread1 extends Thread{
    public void run(){
        System.out.println("hello world " + Thread.currentThread().getName());
    }
}
class Thread2 implements Runnable{
    public void run(){
        System.out.println("hello world runnable " + Thread.currentThread().getName());
    }
}
public class Mult {
    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();

        Thread thread2  = new Thread(new Thread2());
        thread2.start();
    }
}
