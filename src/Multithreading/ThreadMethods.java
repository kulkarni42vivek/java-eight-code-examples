package Multithreading;

public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("inside the thread");
            
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println(t1.getPriority());

    }
}
