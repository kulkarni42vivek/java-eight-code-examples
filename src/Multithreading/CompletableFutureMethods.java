package Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureMethods {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            return "done";
        }).thenApply((x) -> {
            return x.toUpperCase();
        }).thenAccept((x) -> {
            System.out.println(x);
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex);
            return null;
        });

        System.out.println(future.get());
    }
}
