package thread;

public class ThreadJoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
        t3.start();
        t2.start();

        //let all threads finish execution before finishing main thread
        try {
            t1.join();
            t1.wait();
            t1.interrupt();
            System.out.println("Thread1 waiting");
            t2.join();
            System.out.println("Thread2 waiting");
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("All threads are dead, exiting main thread");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread started: "+Thread.currentThread().getName());
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended: "+Thread.currentThread().getName());
    }
}