package Multithreading;

public class InterruptT {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
           try {
                Thread.sleep(1000);
           } catch (InterruptedException e) {
                e.printStackTrace();
           }
        });

        t1.start();
        Thread.sleep(500);
        t1.interrupt();
    }
}
