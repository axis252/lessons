package com.kinomo.model;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private int salary;
    public Employee(){}
    public Employee(int id){
        this.id=id;
    }
    public Employee (int id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;        this.lastName=lastName;
    }
    public Employee(int id, String firstName, String lastName, String jobPosition, int salary ){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.jobPosition=jobPosition;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


