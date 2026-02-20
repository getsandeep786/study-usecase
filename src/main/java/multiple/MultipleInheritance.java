package multiple;

public class MultipleInheritance implements InterfaceA, InterfaceB {

    @Override
    public void display() {
        InterfaceA.super.display(); //Specifies which default method to use
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.display(); // Output: Display from InterfaceA
    }

}
