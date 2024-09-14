package Java8.CompletableFutures;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileProcessing {
    static String filePath = "D:\\FILES\\";
    public static void main(String[] args) {
        usingCompletableFuture();
    }

    public static void usingCompletableFuture(){
        long startTime = System.currentTimeMillis();
        try {
            ExecutorService SERVICE =  Executors.newFixedThreadPool(500);
            List<Future<Void>> futures = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                final int value = i;
                Future<Void> future = CompletableFuture.supplyAsync(()->{
                            try {
                                Thread.sleep(20);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            String fileName = filePath + "file" + value + ".txt";
                            Writer writer = null;
                            try {
                                writer = new FileWriter(fileName, true);
                                writer.write("*");
                                writer.close();
                            } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }


                            return value;
                        },SERVICE)
                        .thenAccept(x->{System.out.println("File Written Successfully ->> " + value);});
                futures.add(future);
            }
            CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).get();
            long endTime = System.currentTimeMillis();
            System.out.println("--> " + (endTime - startTime));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
