package thread;

public class YieldExp extends Thread
{
    public void run()
    {
        for (int i=0; i<1000000 ; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }
    public static void main(String[]args)
    {
        YieldExp t1 = new YieldExp();
        ThreadB t2 = new ThreadB();
        // this will call run() method
        t1.start();
        t2.start();
        t1.yield();
    }
}