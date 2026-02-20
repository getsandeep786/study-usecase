package thread;

class ExtendsThread1 extends Thread {

    private static volatile int counter;

    public void run() {
        synchronized (this) {
            counter++;
            System.out.println("Thread ended: "+Thread.currentThread().getName() + "ExtendsThread : Counter : " + counter);
        }
    }
}

public class Volatile {

    public static void main(String args[]) throws Exception {

        //Creating new instance for every thread access.
        ExtendsThread1 tc1 = new ExtendsThread1();
        ExtendsThread1 tc2 = new ExtendsThread1();
        ExtendsThread1 tc3 = new ExtendsThread1();
        ExtendsThread1 tc4 = new ExtendsThread1();
        ExtendsThread1 tc5 = new ExtendsThread1();
        tc2.start();
        tc3.start();
        tc1.start();tc5.start();tc4.start();

    }
}
