package com.ctseducare.payslip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.payslip.dto.EmployeeDTO;
import com.ctseducare.payslip.dto.PayslipDTO;
import com.ctseducare.payslip.service.PayslipService;

@RestController
public class PayslipController {

  @GetMapping
  String status() {
    return "I am up!";
  }
  
  @Autowired
  PayslipService service;
  
  @PostMapping("/payslip")
  ResponseEntity<List<PayslipDTO>> payslips(@RequestBody List<EmployeeDTO> employees) {
    List<PayslipDTO> result = service.generatePayslip(employees);
    return ResponseEntity.ok(result);
  }
  
}