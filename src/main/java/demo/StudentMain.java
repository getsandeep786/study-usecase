package demo;

public class StudentMain {

    public static void main(String ar[]) {
// create a student object
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(20);

// create a shallow copy of s1
        try {
            Student s2 = (Student) s1.clone();
            s2.setName("Vijay");
            s2.setAge(50);
            System.out.println(s1.getAge());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
