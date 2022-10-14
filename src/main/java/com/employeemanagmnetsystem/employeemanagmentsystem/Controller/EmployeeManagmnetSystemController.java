package com.employeemanagmnetsystem.employeemanagmentsystem.Controller;

import com.employeemanagmnetsystem.employeemanagmentsystem.POJOCLASS.Employee;
import com.employeemanagmnetsystem.employeemanagmentsystem.Repository.EmployeeManagmentSystemRepository;
import com.employeemanagmnetsystem.employeemanagmentsystem.Service.EmployeeManagmenstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/EmployeeController")
public class EmployeeManagmnetSystemController {

    @Autowired
    private EmployeeManagmenstService EmployeeService;

    @Autowired
    private EmployeeManagmentSystemRepository EmployeeRepository;

    //SAVE EMPLOYEE
    @PostMapping("/save")
    public Employee EmployeeSave(@RequestBody Employee Emp) {
        return EmployeeService.EmployeeSaveService(Emp);
    }

    //GET LIST OF EMPLOYEE
       @GetMapping("/getlistofEmployee")
        public List<Employee> getListOfEmployee(){
            return  EmployeeService.getListOfEmployeeService();
        }

        //Get  Employee By Id
        @GetMapping("/getByEmployeeId/{EmployeeId}")
        public ResponseEntity<Employee> getEmployeeById( @PathVariable ("EmployeeId")int EmployeeId){
            Optional<Employee> emp = EmployeeService.getEmployeeById(EmployeeId);
            if(emp.isPresent()){
                return new ResponseEntity<>(emp.get(), HttpStatus.OK);
            }else {
                return new ResponseEntity<>(null , HttpStatus.NOT_FOUND);
            }
        }

        //Update Employee By Id
    @GetMapping("/updateEmployyeBy/{EmpId}")
        public Employee UpdateEmployeeById (@RequestBody Employee emp ,@PathVariable("EmployeeId") int EmployeeId){
        return EmployeeService.UpdateEmployeeByIdService(emp,EmployeeId);
        }

        //Delete Employee By Id
        @GetMapping("/deleteEmployeeBy/{EmpId}")
        public void DeleteEmployeeById(@PathVariable("EmployeeId") int EmployeeId){
        EmployeeService.DeleteEmployeeById(EmployeeId);
        }






    }

