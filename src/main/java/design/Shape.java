package design;

public interface Shape {

    void draw();

    public default void show()
    {
        System.out.println("Main I Interface");
    }

    static boolean isNull(String str) {
        System.out.println("Interface Main 1 Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
