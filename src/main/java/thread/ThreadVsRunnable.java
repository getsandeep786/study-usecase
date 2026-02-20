package thread;

class ExampleTwo implements Runnable {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ImplementsRunnable : Counter : " + counter);
    }
}

class ExampleOne extends Thread {

    private int counter = 0;

    public void run() {
        counter++;
        System.out.println("ExtendsThread : Counter : " + counter);
    }
}

public class ThreadVsRunnable {

    public static void main(String args[]) throws Exception {
        //only one object is created for the class and the same object is shared across different threads
        ExampleTwo rc = new ExampleTwo();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        Thread t3 = new Thread(rc);
        t3.start();

        //A new object is created for each thread processing.
        ExampleOne tc1 = new ExampleOne();
        tc1.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ExampleOne tc2 = new ExampleOne();
        tc2.start();
        Thread.sleep(1000); // Waiting for 1 second before starting next thread
        ExampleOne tc3 = new ExampleOne();
        tc3.start();

    }
}
