package Java8.CompletableFutures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureMethods {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            return "done";
//        }).thenApply((x) -> {
//            return x.toUpperCase();
//        }).thenAccept((x) -> {
//            System.out.println(x);
//        }).exceptionally(ex -> {
//            System.out.println("Exception: " + ex);
//            return null;
//        });
//
//        System.out.println(future.get());

    }
}
