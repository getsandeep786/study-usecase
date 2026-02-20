package org.example;

public class sss {

    public static void main(String ar[]){
        try {
            //Code
            System.exit(0);
            System.out.println("Execution");
        }
        catch (Exception ex) {
            //Log the exception
            System.out.println("Exception");
        }
        finally {
            //System.exit(1);
            System.out.println("Finally");
        }
    }
}
