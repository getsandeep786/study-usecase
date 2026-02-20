package thread;

public class TestMultiPriority1 extends Thread {

    public void run() {
        System.out.println("Running thread priority is:" + Thread.currentThread().getPriority());
        try {
            Thread.sleep(5000);
            System.out.println("Shutdwon thread priority is:" + Thread.currentThread().getPriority());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        TestMultiPriority1 m3 = new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.NORM_PRIORITY);
        m1.start();
        try {
            m1.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //m1.yield();
        m2.start();
        m3.start();
    }
}
