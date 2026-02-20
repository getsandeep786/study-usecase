package demo;

import org.example.MainI;
import org.example.MainII;

public class Main implements MainI, MainII {

    public static void main(String[] args) {
        org.example.Main mn = new org.example.Main();
        org.example.Main mn1 = new org.example.Main();
        System.out.println(mn.equals(mn1));
        System.out.println(mn.Sand());
        mn.show1();
        mn.loopy();
        //isNull("s");
        MainI.isNull("s");
        MainII.isNull("s");
        MainI ref = mn::Sandeep;
        ref.Sand();
    }

    @Override
    public String Sand() {
        return null;
    }

    @Override
    public void show() {
        MainI.super.show();
    }

    @Override
    public void loopy() {
        MainI.super.loopy();
    }
}