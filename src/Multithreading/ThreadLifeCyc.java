package Multithreading;

public class ThreadLifeCyc {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            System.out.println("RUNNING");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(500);
        System.out.println(thread.getState());
        thread.join();        System.out.println(thread.getState());
    }
}