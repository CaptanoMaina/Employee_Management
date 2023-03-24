package com.captano.app.Employee_Management.controller;

import com.captano.app.Employee_Management.exception.ResourceNotFoundException;
import com.captano.app.Employee_Management.model.EmployeeModel;
import com.captano.app.Employee_Management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<EmployeeModel> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees/{user_id}")
    public ResponseEntity<EmployeeModel> getEmployeeByuserId(@PathVariable Long user_id){
        EmployeeModel employeeModel = employeeRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee record does not exist with user id:" + user_id ));
        return ResponseEntity.ok(employeeModel);
    }


}
