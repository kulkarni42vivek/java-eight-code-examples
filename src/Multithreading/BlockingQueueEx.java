package Multithreading;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueEx {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(10);

        // producer
        Thread producer = new Thread(()->{
            for(int i = 0 ;i< 20 ;i++){
                try {
                    blockingQueue.put("ser"+ i);
                    System.out.println("produced --> " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // consumer
        Thread consumer = new Thread(()->{
            for(int i = 0 ;i< 20 ;i++){
                try {
                    String value = blockingQueue.take();
                    System.out.println("consumer -->  "+ value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        consumer.start();
        producer.start();
    }
}
