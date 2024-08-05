package Multithreading;
class Counter{
    int counter ;
    Counter(){
        this.counter = 0 ;
    }
    public int getCounter() {
        return counter;
    }
    public synchronized void setCounter() {
        this.counter++;
    }
}
public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Counter counter  = new Counter();
        Thread thread   = new Thread(()->{
            for(int i = 0 ;i< 10000;i++){
                counter.setCounter();
            }
        });
        Thread thread2   = new Thread(()->{
            for(int i = 0 ;i< 10000;i++){
                counter.setCounter();
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();
        System.out.println(counter.getCounter());
    }
}
