package Multithreading;

class CounterObj{
    public int counter =  0;

    public synchronized void incrementCounter(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}
public class Counters{
    public static void main(String[] args) throws InterruptedException {
        CounterObj obj  = new CounterObj();

        Thread[] threadsArray  = new Thread[100];

        for(int i = 0 ;i<threadsArray.length ; i++){
            threadsArray[i] = new Thread(()->{
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int j = 0 ;j<10;j++){
                    obj.incrementCounter();
                }
            });
            threadsArray[i].start();
        }

        for(int i = 0 ;i<threadsArray.length ; i++){
            threadsArray[i].join();
        }

        System.out.println(obj.getCounter());
    }
}
