package org.example;

public class Employee2 implements Comparable<Employee2> {

    private int id;

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee2(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

//    @Override //String Comparison we need to use CompareTo
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.getName());
//    }

    @Override //Integer sort we need to use minus
    public int compareTo(Employee2 o) {
        return this.id - o.getId();
    }
}