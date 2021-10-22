package com.ctseducare.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctseducare.employee.model.Employee;
import com.ctseducare.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository repository;
  
  public Employee insert(Employee employee) {
    return repository.save(employee);
  }
  
  public List<Employee> findAll() {
    return repository.findAll();
  }
  
  public Employee update(Employee employee) {
    return repository.save(employee);
  }
  
  public void delete(Integer id) {
    repository.deleteById(id);
  }
  
}
