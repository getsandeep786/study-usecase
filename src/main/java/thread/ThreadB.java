package thread;

public class ThreadB extends Thread {
    int total;

    public void run() {
        synchronized(this) {
            for(int i = 0; i < 100000000; i++) {
                total += i;
                System.out.println(Thread.currentThread().getName() + " in control" + i);
            }
            notify();
        }
    }
}
