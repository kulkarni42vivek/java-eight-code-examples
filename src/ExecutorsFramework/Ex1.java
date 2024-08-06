package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex1 {
    public static void getFactorial(int data ) {

        int answer = 1;
        for(int i = 1 ;i<=data ; i++){
            answer = answer * i;
        }
        System.out.println("Thread --> "+  Thread.currentThread().getName() +" --> " +   answer);
    }
    public static void main(String[] args) throws InterruptedException {

        // using withoud thread

        Long start  = System.currentTimeMillis();
        for(int i = 1;i<=25 ;i++){
            getFactorial(i);
        }
        Long end  = System.currentTimeMillis();
        System.out.println("TIME --> " +( end -start));

        // with using the theads
        Long start2  = System.currentTimeMillis();
        Thread[] thread  = new Thread[25];
        for(int i = 1;i<=25 ;i++){
            int finalI = i;
            thread[i-1] = new Thread(()->{
                getFactorial(finalI);
            });
            thread[i-1].start();
        }
        for(Thread tr : thread){
            tr.join();
        }
        Long end2 = System.currentTimeMillis();
        System.out.println("TIME USING THREAD --> " +(end2 - start2));

        // using the thread pool

        Long start3 = System.currentTimeMillis();
        ExecutorService service  = Executors.newFixedThreadPool(25);
        service.submit(()->{
            for(int i = 1;i<= 25 ;i++){
                getFactorial(i);
            }
        });
        service.shutdown();
        service.awaitTermination(100, TimeUnit.MILLISECONDS);
        Long end3 = System.currentTimeMillis();
        System.out.println("USING THE EXECUTORS TIME --> " + (end3 - start3));

    }
}
