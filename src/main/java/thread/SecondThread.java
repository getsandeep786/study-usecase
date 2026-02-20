package thread;

class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("I am in first thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Exception occurs ");
            }
        }
    }
}

public class SecondThread {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        ft.start();
        for (int j = 1; j < 10; ++j) {
            System.out.println("I am in second thread");
        }
    }
}