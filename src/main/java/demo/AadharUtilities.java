package demo;

public class AadharUtilities extends AadharNumber{

    public static void main(String args[]){
        AadharUtilities utilities = new AadharUtilities();
        System.out.println(utilities.validate("ads"));
        System.out.println(utilities.changeAddress("ads"));

    }

    public boolean changeAddress(String newAddress){
        return true;
    }
}
