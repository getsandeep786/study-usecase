package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);//creating a pool of 5 threads
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }
        Runnable worker1 = new WorkerThread("sand");
        executor.execute(worker1);
        executor.shutdown();
        System.out.println("shutdown");
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
    }
}
