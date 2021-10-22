package com.ctseducare.payroll.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="employee-service")
public interface EmployeeFeignClient {

  @GetMapping("/employee")
  ResponseEntity<List<Employee>> findAll();
   
}