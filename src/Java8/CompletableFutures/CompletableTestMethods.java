package Java8.CompletableFutures;

import java.util.concurrent.CompletableFuture;

public class CompletableTestMethods {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->{
            return 12;
        }).thenApplyAsync((x)->{
            return x*2;
        });
        future.thenAccept(x->{
            System.out.println(x);
        });


        CompletableFuture<Integer> tst = CompletableFuture.supplyAsync(() -> {
            int result = 10 / 0; // Causes an ArithmeticException
            return result;
        });

        tst.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value to return if there's an exception
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        });
    }
}
