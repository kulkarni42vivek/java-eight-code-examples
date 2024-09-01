package Java8.CompletableFutures;

import java.util.concurrent.CompletableFuture;

public class CompletebleApiAllHandle {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            int result = 10;
            return result;
        });

        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            return 20;
        });

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        allFutures.exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return null;
        }).thenRun(() -> {
            // All futures completed
            int result1 = future1.join();
            int result2 = future2.join();
            int result3 = future3.join();
            System.out.println(result1 + ", " + result2 + ", " + result3);
        });

        Thread.sleep(1000);
    }
}
