package com.org;

public class Student {
    private int id;
    private String name;
    private String email;
    private int salary;

    public Student(int id, String name, String email, int salary) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID='" + id + '\'' + ", Name=" + name + ", Email='" + email + '\'' + ", salary=" + salary + '}';
    }
}
