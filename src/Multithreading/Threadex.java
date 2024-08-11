package Multithreading;


class Thread8 implements  Runnable{
    public void run(){
        for(int i=0;i< 6;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class Threadex extends Thread{

    public void run(){
        for(int i=0;i< 6;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
//        Threadex thrad = new Threadex();
//        thrad.run();
//        Threadex thread2 = new Threadex();
//        thread2.start();

        Thread8 threadv = new Thread8();
        Thread8 thr = new Thread8();
        threadv.run();
        thr.run();

    }
}
