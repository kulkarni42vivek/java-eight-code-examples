package Multithreading;

public class ThreadYield {
    public static void main(String[] args) {
        Runnable runnablet = ()->{
            for(int i = 0 ;i< 10 ;i++){
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " --> " + i);
            }
        };
        Thread thread1 = new Thread(runnablet);
        Thread thread2 = new Thread(runnablet);
        thread1.start();
        thread2.start();
    }
}
