package ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex2 {

    public static void getFactorial(int data ) {
        int answer = 1;
        for(int i = 1 ;i<=data ; i++){
            answer = answer * i;
        }
        System.out.println("Thread --> "+  Thread.currentThread().getName() +" --> " +   answer);
    }

    public static void main(String[] args) throws InterruptedException {

        // with using the theads
        Long start2  = System.currentTimeMillis();
        Thread[] thread  = new Thread[20];
        for(int i = 1;i<=20 ;i++){
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


        Long start3 = System.currentTimeMillis();
        ExecutorService service  = Executors.newFixedThreadPool(10);
        service.submit(()->{
            for(int i = 1;i<= 20 ;i++){
                getFactorial(i);
            }
        });
        service.shutdown();
        while (!service.awaitTermination(5, TimeUnit.MILLISECONDS)){
            System.out.println("RUNNING ....!");
        }

        Long end3 = System.currentTimeMillis();
        System.out.println("USING THE EXECUTORS TIME --> " + (end3 - start3));
    }
}
