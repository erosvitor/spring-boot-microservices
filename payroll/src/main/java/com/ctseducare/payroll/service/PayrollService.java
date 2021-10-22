package com.ctseducare.payroll.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctseducare.payroll.dto.EmployeeDTO;
import com.ctseducare.payroll.dto.PayrollDTO;
import com.ctseducare.payroll.dto.PayslipDTO;
import com.ctseducare.payroll.feignclient.Employee;
import com.ctseducare.payroll.feignclient.EmployeeFeignClient;
import com.ctseducare.payroll.feignclient.PayslipFeignClient;

@Service
public class PayrollService {
  
  @Autowired
  EmployeeFeignClient employee;
  
  @Autowired
  PayslipFeignClient payslip;
  
  public PayrollDTO generatePayroll() {
    List<Employee> employees = employee.findAll().getBody();

    List<EmployeeDTO> employeeDTOs = new ArrayList<>();
    for (Employee employee : employees) {
      EmployeeDTO e = new EmployeeDTO();
      e.setId(employee.getId());
      e.setName(employee.getName());
      e.setSalary(employee.getSalary());
      employeeDTOs.add(e);
    }
    
    List<PayslipDTO> payslipDTOs = payslip.payslips(employeeDTOs).getBody();
    
    PayrollDTO payroll = new PayrollDTO();
    payroll.setDatetime(LocalDateTime.now());
    payroll.setPayslips(payslipDTOs);
    
    return payroll;
  }
  
}
