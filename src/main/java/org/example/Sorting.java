package org.example;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        Employee2[] empArr = new Employee2[4];
        empArr[0] = new Employee2(10, "Mikey", 25, 10000);
        empArr[1] = new Employee2(20, "Arun", 29, 20000);
        empArr[2] = new Employee2(5, "Lisa", 35, 5000);
        empArr[3] = new Employee2(1, "Pankaj", 32, 50000);
        System.out.println("Id");
        System.out.println(Arrays.toString(empArr));
        Arrays.sort(empArr);
        System.out.println(Arrays.toString(empArr));
        System.out.println("*****************");

        Employee1[] empArr1 = new Employee1[4];
        empArr1[0] = new Employee1(10, "Mikey", 25, 10000);
        empArr1[1] = new Employee1(20, "Arun", 29, 20000);
        empArr1[2] = new Employee1(5, "Lisa", 35, 5000);
        empArr1[3] = new Employee1(1, "Pankaj", 32, 50000);

        Comparator<Employee1> salaryComp = new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        };
        System.out.println("Salary");
        System.out.println(Arrays.toString(empArr1));
        Arrays.sort(empArr1, salaryComp);
        System.out.println(Arrays.toString(empArr1));
        System.out.println("*****************");

        List<Employee1> empArr2 = new ArrayList<Employee1>();
        empArr2.add(new Employee1(10, "Mikey", 25, 10000));
        empArr2.add(new Employee1(20, "Arun", 29, 20000));
        empArr2.add(new Employee1(20, "Arun", 29, 20000));
        empArr2.add(new Employee1(5, "Lisa", 35, 5000));
        empArr2.add(new Employee1(1, "Pankaj", 32, 50000));

        Comparator<Employee1> nameSorting = new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 o1, Employee1 o2) {
                return (o1.getName()).compareTo(o2.getName());
            }
        };
        System.out.println("Name");
        System.out.println(empArr2);
        Collections.sort(empArr2, nameSorting);
        System.out.println(empArr2);

    }
}
