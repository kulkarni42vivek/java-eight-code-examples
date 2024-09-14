package Basic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileProcessing {
    public static void main(String[] args) throws InterruptedException {
        String basePath = "D:\\FILES\\";
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 500; i++) {
            String filename = basePath + "file" + i + ".txt";
            File file = new File(filename);
            Thread.sleep(100);
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                writer.println(i);
                System.out.println("Created file " + filename + " with value " + i);
            } catch (IOException e) {
                System.err.println("Error creating file " + filename + ": " + e.getMessage());
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
