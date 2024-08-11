package Multithreading;
class ThreadC extends  Thread{
    @Override
    public void run() {
        System.out.println("this is thread class");
    }
}
class Threadd implements  Runnable{
    public void run(){
        System.out.println( Thread.currentThread().getName()+ " --> Thread in runnable --> " + Thread.currentThread().getPriority());
    }
}
public class ThreadStart {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("THREAD IS HERE");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ThreadC classthread = new ThreadC();
        classthread.start();
        Thread runnableThread = new Thread(new Threadd());
        runnableThread.setPriority(Thread.MAX_PRIORITY);
        runnableThread.start();
        runnableThread.setName("max priority thread ");
        System.out.println(runnableThread.getId());
        thread.start();

        // alive mehtod
        Thread thrr = new Thread(()->{
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(thrr.isAlive());
        thrr.start();
        System.out.println(thrr.isAlive());
    }
}
