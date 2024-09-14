package Basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessingWithCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String basePath = "D:\\FILES\\";
        List<CompletableFuture<Void>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(100);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            int finalI = i;
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                String fileName = basePath + "file" + finalI + ".txt";
                File file = new File(fileName);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                    writer.println(finalI);
                    System.out.println("Thread " + Thread.currentThread().getName() + " with value " + finalI);
                } catch (IOException e) {
                    System.err.println("Error creating file " + fileName + ": " + e.getMessage());
                }
            } , service);
            futures.add(future);
        }

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
        allFutures.get(); // Wait for all futures to complete

        long end = System.currentTimeMillis();
        System.out.println("----------------------------");
        System.out.println("Time taken: " + (end - start) + " ms");
    }
}
