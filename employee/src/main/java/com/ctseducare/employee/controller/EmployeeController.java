package com.ctseducare.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.employee.model.Employee;
import com.ctseducare.employee.service.EmployeeService;

@RestController
public class EmployeeController {

  @GetMapping
  String status() {
    return "I am up!";
  }
 
  @Autowired
  EmployeeService service;
  
  @PostMapping("/employee")
  ResponseEntity<Employee> insert(@RequestBody Employee employee) {
    Employee result = service.insert(employee);
    return ResponseEntity.ok(result);
  }
  
  @GetMapping("/employee")
  ResponseEntity<List<Employee>> findAll() {
    List<Employee> result = service.findAll();
    return ResponseEntity.ok(result);
  }

  @PutMapping("/employee")
  ResponseEntity<Employee> update(@RequestBody Employee employee) {
    Employee result = service.update(employee);
    return ResponseEntity.ok(result);
  }

  @DeleteMapping("/employee/{id}")
  ResponseEntity<String> delete(@PathVariable("id") Integer id) {
    service.delete(id);
    return ResponseEntity.ok("Employee deleted!");
  }

}
