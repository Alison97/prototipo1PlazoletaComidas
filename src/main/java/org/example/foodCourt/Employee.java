package org.example.foodCourt;

import java.util.Date;

public class Employee extends Person {
    private String position;
    private int salary;
    private Date startDate;
    private String actualStatus;

    public Employee(int id, String name, String lastName, Date dateOfBirth, int phone, String email, String city, String neighborhood, String address, String rol, String position, int salary, Date startDate,String actualStatus) {
        super(id, name, lastName, dateOfBirth, phone, email, city, neighborhood, address, rol);
    this.position = position;
    this.salary = salary;
    this.startDate = startDate;
    this.actualStatus = actualStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getActualStatus() {
        return actualStatus;
    }

    public void setActualStatus(String actualStatus) {
        this.actualStatus = actualStatus;
    }
}
