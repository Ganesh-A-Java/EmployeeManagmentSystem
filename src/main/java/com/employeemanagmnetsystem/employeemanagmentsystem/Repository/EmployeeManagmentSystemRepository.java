package com.employeemanagmnetsystem.employeemanagmentsystem.Repository;

import com.employeemanagmnetsystem.employeemanagmentsystem.POJOCLASS.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeManagmentSystemRepository extends JpaRepository<Employee , Integer> {

}
