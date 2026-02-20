package design;

public class Rectangle implements Shape {
    private String str = "";

    @Override
    public void draw() {
        str = "Sandeep";
        System.out.println(str);
    }

    @Override
    public void show() {
        str = "Sandeep";
        System.out.println(str);
    }

    public void draw1() {
        System.out.println("Inside Rectangle::draw1() method.");
    }

    public static void main(String[] args) {
        Shape rec = new Rectangle();
        Shape.isNull("Sand");
        rec.show();
        rec.draw();
//        rec.draw1(); Compile Error
        preIncrement();
        postIncrement();
    }

    private static void preIncrement() {
        int i = 10;
        int j = ++i;
        System.out.println("Pre-Increment J value : " + j);
        System.out.println("Pre-Increment I value : " + ++i);
    }

    private static void postIncrement() {
        int i = 10;
        int j = i++;
        System.out.println("Post-Increment J value : " + j);
        System.out.println("Post-Increment I value : " + i);
    }
}
