package com.employeemanagmnetsystem.employeemanagmentsystem.POJOCLASS;

import org.hibernate.annotations.Cascade;
import org.jboss.jandex.TypeTarget;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int EmployeeId;
    public String EmployeeFirstName;
    public String EmployeeLastName;
    public String EmployeeSalary;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Employee() {
    }

    public Employee(String employeeFirstName, String employeeLastName, String employeeSalary, Address address) {
        EmployeeFirstName = employeeFirstName;
        EmployeeLastName = employeeLastName;
        EmployeeSalary = employeeSalary;
        this.address = address;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        EmployeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return EmployeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        EmployeeLastName = employeeLastName;
    }

    public String getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeFirstName='" + EmployeeFirstName + '\'' +
                ", EmployeeLastName='" + EmployeeLastName + '\'' +
                ", EmployeeSalary='" + EmployeeSalary + '\'' +
                ", address=" + address +
                '}';
    }
}
