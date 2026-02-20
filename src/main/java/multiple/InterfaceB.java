package multiple;

public interface InterfaceB {

    default void display() {
        System.out.println("Display from InterfaceB");
    }
}
