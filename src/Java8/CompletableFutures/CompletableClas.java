package Java8.CompletableFutures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableClas {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*CompletableFuture<String> future =  CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(500);
                int answer =10/0;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "done";
        }).exceptionally(ex -> "exception");
        System.out.println(future.get());*/

        // what is completable futures
        // -- for asynchronous programming
        // -- writing non-blocking code where you have n tasks without blockng the main thread
        // -- why use completable futures
        // --- demerits of futures objects
        // --- cannot manually be completed
        // --- multiple futures cannot be chained together
        // --- cannot combine futures

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task completed");
        });

        System.out.println("Main thread is not blocked");




        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Result from task";
        });

        future1.thenAccept(s -> System.out.println(s));

        try {
            future.get();
        } catch (Exception e) {
            System.out.println("Task failed: " + e.getMessage());
        }

        System.out.println("Main thread is done");


        // then apply -> function
        // then accept -> consumer
        // then run -> runnable
        ExecutorService exService = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> cmp  = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "two,three,four";
        }).thenApply(s -> s.split(",")).thenAccept(strings -> System.out.println(strings[0]));
        cmp.get();
    }
}
