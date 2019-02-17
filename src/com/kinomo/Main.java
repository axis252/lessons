package com.kinomo;

import com.kinomo.audit.Manager;
import com.kinomo.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee Fedya = new Employee(1, "Fedya", "Fedin","Junior", 0 );
        Employee Petya = new Employee(1, "Petya", "Petin","Senior", 0 );
        Manager managerForFedya = new Manager(Fedya);
        Manager managerForPetya = new Manager(Petya);
        managerForPetya.printFullName();
        managerForFedya.printFullName();
        managerForPetya.countSalary();
        managerForFedya.countSalary();
        System.out.println("New Fedia's salary: " + Fedya.getSalary());
        System.out.println("New Petya's salary: " + Petya.getSalary());



    }
}
