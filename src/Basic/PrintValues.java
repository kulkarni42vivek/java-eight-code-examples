package Basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintValues {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        int ans1 = 0;
        for(int i = 0 ;i<1000;i++){
            System.out.print(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println();


        ExecutorService service  = Executors.newFixedThreadPool(5);

        long start2 = System.currentTimeMillis();
        for(int i = 0 ;i<1000;i++){
            int finalI = i;
            service.submit(()->{
                System.out.print(finalI);
            });
        }
        long end2 = System.currentTimeMillis();

        System.out.println();

        System.out.println("1 --> " +(end1 - start1));
        System.out.println("2 --> " +(end2 - start2));
    }
}
