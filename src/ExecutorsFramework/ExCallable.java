package ExecutorsFramework;

import java.util.concurrent.*;

public class ExCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task  = ()->{
            Thread.sleep(500);
            return 1;
        };

        ExecutorService service  = Executors.newFixedThreadPool(10);
        Future<Integer> future =  service.submit(task);
        System.out.println(future.get());
        service.shutdown();
    }
}
