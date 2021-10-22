package com.ctseducare.payroll.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ctseducare.payroll.dto.EmployeeDTO;
import com.ctseducare.payroll.dto.PayslipDTO;

@FeignClient(name="payslip-service")
public interface PayslipFeignClient {

  @PostMapping("/payslip")
  ResponseEntity<List<PayslipDTO>> payslips(@RequestBody List<EmployeeDTO> employees);

}
