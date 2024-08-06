package ExecutorsFramework;

import java.util.*;
import java.util.concurrent.*;

public class InvokeALLtest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exec  = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> task  = new ArrayList<>();
        Callable task1 =  () ->{
          Thread.sleep(1000);
          return 1;
        };
        Callable task2 =  () ->{
            Thread.sleep(1000);
            return 1;
        };
        Callable task3 =  () ->{
            Thread.sleep(3000);
            return 1;
        };
        task.add(task1);
        task.add(task2);
        task.add(task3);


        List<Future<Integer>> future  =  exec.invokeAll(task);
        for(Future<Integer> fu : future){
            System.out.println(fu.get());
        }
        exec.shutdown();
    }
}
