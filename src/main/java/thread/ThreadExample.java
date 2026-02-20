package thread;

import static java.lang.Thread.currentThread;

class MyThread extends Thread
{
    public void run() {
        System.out.println("I am executed by " +currentThread().getName());
        for(int i = 0; i<10000;i++){
//            System.out.println(i);
        }
    }
}

public class ThreadExample
{
    public static void main(String[] args) {
        System.out.println("I am executed by " +currentThread().getName());

        MyThread myThread = new MyThread();

        // Calling run() method directly
        myThread.run();

        // Calling start() method. It creates a new thread which executes run() method
        myThread.start();
        System.out.println("Finished");

    }
}