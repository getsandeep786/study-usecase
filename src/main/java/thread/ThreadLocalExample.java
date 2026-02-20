package thread;

public class ThreadLocalExample {


    public static class RunnableDemo implements Runnable {

        int counter;

        ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<Integer>();

        public void run() {
            counter++;
            for(int i=0; i<3; i++) {
                if (threadLocalCounter.get() != null) {
                    threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
                } else {
                    threadLocalCounter.set(0);
                }
            }
            System.out.println("Counter: " + counter + " : Current Thread Name:" + Thread.currentThread().getName());
            System.out.println("threadLocalCounter: " + threadLocalCounter.get() + " : Current Thread Name:" + Thread.currentThread().getName());
        }
    }

    public static void main(String args[]) {
        RunnableDemo commonInstance = new RunnableDemo();
        Thread t1 = new Thread(commonInstance);
        Thread t2 = new Thread(commonInstance);
        Thread t3 = new Thread(commonInstance);
        Thread t4 = new Thread(commonInstance);
        t1.setName("Sand1");
        t2.setName("Sand2");
        t3.setName("Sand3");
        t4.setName("Sand4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // wait for threads to end
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//            t4.join();
//            System.out.println("Finished");
//        } catch (Exception e) {
//            System.out.println("Interrupted");
//        }
        System.out.println("FinishedI");
    }
}
