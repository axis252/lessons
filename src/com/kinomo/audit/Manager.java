package com.kinomo.audit;

import com.kinomo.model.Employee;

public class Manager {
private Employee employee;
public Manager (Employee employee) {this.employee=employee;}
public void printFullName(){
    System.out.println("Full name: "+ employee.getFirstName() + employee.getLastName() );

}
public void countSalary(){
    String position = employee.getJobPosition();
    if ("Junior".equals(position)){
        employee.setSalary(100);
    }
    else if ("Middle".equals(position)){
        employee.setSalary(200);
    }
    else if ("Senior".equals(position)){
        employee.setSalary(300);
    }
    else {employee.setSalary(0);
    }
        }
    }



