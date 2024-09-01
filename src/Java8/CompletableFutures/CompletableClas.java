package Java8.CompletableFutures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableClas {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future =  CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(500);
                int answer =10/0;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "done";
        }).exceptionally(ex -> "exception");
        System.out.println(future.get());
    }
}
