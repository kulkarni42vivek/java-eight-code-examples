package Multithreading;

public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (true) {
                System.out.println("running");
            }
         });
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(2000);
        
    }
}
