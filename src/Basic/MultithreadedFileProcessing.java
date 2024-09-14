package Basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultithreadedFileProcessing {
    public static void main(String[] args) throws InterruptedException {
        String basePath = "D:\\FILES\\";
        ExecutorService service = Executors.newFixedThreadPool(100);
        long start  = System.currentTimeMillis();
        for(int i = 0 ;i<500; i++){
            int finalI = i;
            service.submit(() -> {
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
            });
        }
        service.shutdown(); // Prevent new tasks from being submitted
        service.awaitTermination(1, TimeUnit.MINUTES);

        long end = System.currentTimeMillis();
        System.out.println("----------------------------");
        System.out.println(end - start);
    }
}

