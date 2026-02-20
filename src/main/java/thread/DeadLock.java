package thread;

public class DeadLock implements Runnable {
    final String resource1 = "kamal";
    final String resource2 = "rajini";

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println("Thread 1: locked resource 1");

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }

            synchronized (resource2) {
                System.out.println("Thread 1: locked resource 2");
            }
        }
        synchronized (resource2) {
            System.out.println("Thread 2: locked resource 2");

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }

            synchronized (resource1) {
                System.out.println("Thread 2: locked resource 1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread t1 = new Thread(deadLock);
        Thread t2 = new Thread(deadLock);
        t1.start();
        t2.start();
    }
}