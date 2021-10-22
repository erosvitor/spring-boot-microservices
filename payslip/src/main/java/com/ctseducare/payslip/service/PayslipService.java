package com.ctseducare.payslip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ctseducare.payslip.dto.EmployeeDTO;
import com.ctseducare.payslip.dto.PayslipDTO;
import com.ctseducare.payslip.util.PayslipCalculus;

@Service
public class PayslipService {
  
  public List<PayslipDTO> generatePayslip(List<EmployeeDTO> employees) {
    List<PayslipDTO> payslips = new ArrayList<>();
    for (EmployeeDTO employee : employees) {
      PayslipDTO payslip = new PayslipDTO();
      payslip.setId(employee.getId());
      payslip.setName(employee.getName());
      payslip.setSalary(employee.getSalary());
      payslip.setFgts(PayslipCalculus.fgts(employee.getSalary()));
      payslip.setInss(PayslipCalculus.inss(employee.getSalary()));
      payslips.add(payslip);
    }
    return payslips;
  }

}
