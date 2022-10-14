package com.employeemanagmnetsystem.employeemanagmentsystem.Service;

import com.employeemanagmnetsystem.employeemanagmentsystem.POJOCLASS.Employee;
import com.employeemanagmnetsystem.employeemanagmentsystem.Repository.EmployeeManagmentSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManagmenstService {

    @Autowired
    private EmployeeManagmentSystemRepository EmployeeRepository;

    //SAVE SERVICE METHOD
    public Employee EmployeeSaveService(Employee emp) {
        return EmployeeRepository.save(emp);
    }

    //GETLISTOF EMPLOYEE METHOD
    public List<Employee> getListOfEmployeeService() {
        return EmployeeRepository.findAll();
    }

    //Get Employee By Id
    public Optional<Employee> getEmployeeById(int employeeId) {
        return EmployeeRepository.findById(employeeId);
    }

    //Update Employee By Id
    public Employee UpdateEmployeeByIdService( Employee PostEntity,int employeeId) {
        Employee DBEntity = EmployeeRepository.findById(employeeId).get();

        if (DBEntity != null) {

            if (PostEntity.getEmployeeFirstName() != null)
                DBEntity.setEmployeeFirstName(PostEntity.getEmployeeFirstName());
            if (PostEntity.getEmployeeLastName() != null)
                DBEntity.setEmployeeLastName(PostEntity.getEmployeeLastName());
            if (PostEntity.getAddress().getCity() != null)
                DBEntity.getAddress().setCity(PostEntity.getAddress().getCity());
            if (PostEntity.getAddress().getState() != null)
                DBEntity.getAddress().setState(PostEntity.getAddress().getState());
            if (PostEntity.getAddress().getCountry() != null)
                DBEntity.getAddress().setCountry(PostEntity.getAddress().getCountry());

            return EmployeeRepository.save(DBEntity);
        }
        return DBEntity;
    }

    //Delete Employee Id
    public void DeleteEmployeeById(int employeeId) {
        Employee empId = EmployeeRepository.findById(employeeId).get();
        EmployeeRepository.delete(empId);
    }
}
