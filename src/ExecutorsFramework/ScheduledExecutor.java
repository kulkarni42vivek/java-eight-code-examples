package ExecutorsFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService service  = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(()->{
            System.out.println("five");
        },5 ,5, TimeUnit.SECONDS);
        service.schedule(()->{
            System.out.println("hello");
        }, 20 , TimeUnit.SECONDS);


        service.shutdown();
    }
}
