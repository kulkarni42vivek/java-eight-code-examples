package ExecutorsFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex3Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service  = Executors.newFixedThreadPool(10);
        Future<Integer>future  = service.submit(()-> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        });

        if(future.isDone()){
            System.out.println("success");
        }
        System.out.println(future.get());
        if (future.isDone()) {
            System.out.println("success");
        }
        service.shutdown();
    }
}
