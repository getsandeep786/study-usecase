package thread;

public class ThreadsInterruptExample extends Thread {

    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Task");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted");
        }
    }
    public static void main(String args[]) {
        ThreadsInterruptExample t1 = new ThreadsInterruptExample();
        t1.start();
        try {
            t1.interrupt();
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
