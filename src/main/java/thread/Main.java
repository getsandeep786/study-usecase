package thread;

public class Main {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        try {
            b.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (b) {
            try {
                System.out.println("Waiting for b to complete...");
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is: " + b.total);
        }
        System.out.println("sss" + b.total);
    }
}
