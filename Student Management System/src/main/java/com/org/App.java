package com.org;

import java.sql.SQLException;
import java.util.AbstractList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        while (true) {
            System.out.println("Employee Management");
            System.out.println("1 = Create");
            System.out.println("2 = Read");
            System.out.println("3 = Update");
            System.out.println("4 = Delete");
            System.out.println("5 = Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice < 1 || choice >= 5) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter ID :=");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name :=");
                    String name = sc.nextLine();
                    System.out.println("Enter Email :=");
                    String email = sc.nextLine();
                    System.out.println("Enter Salary :=");
                    int salary = sc.nextInt();
                    Employee emp = new Employee(id, name, email, salary);
                    EmployeeDao.createEmployee(emp);
                    break;

                case 2:
                    AbstractList<Employee> List = EmployeeDao.readAllEmployee();
                    for (Employee employee : List) {
                        System.out.println(employee);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Enter Name := ");
                    name = sc.nextLine();
                    System.out.println("Enter ID Number Where Change := ");
                    id = sc.nextInt();
                    EmployeeDao.updateEmployee(id, name);
                    break;

                case 4:
                    System.out.println("Enter ID Which You Want Delete := ");
                    id = sc.nextInt();
                    EmployeeDao.deleteEmployee(id);


            }


        }
    }
}
