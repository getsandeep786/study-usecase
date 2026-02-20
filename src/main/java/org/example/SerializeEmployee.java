package org.example;

import java.io.Serializable;

public class SerializeEmployee implements Serializable {

    private transient String name;
    private static final long serialVersionUID = -299482708790407L;
    private String gender;
    private int age;
    private String role;

    public SerializeEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SerializeEmployee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
