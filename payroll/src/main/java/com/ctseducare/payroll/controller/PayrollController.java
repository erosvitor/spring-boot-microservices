package com.ctseducare.payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.payroll.dto.PayrollDTO;
import com.ctseducare.payroll.service.PayrollService;

@RestController
public class PayrollController {

  @GetMapping
  String status() {
    return "I am up!";
  }
  
  @Autowired
  PayrollService service;
  
  @GetMapping("/payroll")
  ResponseEntity<PayrollDTO> generatePayroll() {
    PayrollDTO payroll = service.generatePayroll();
    return ResponseEntity.ok(payroll);
  }
  
}
