package com.ctseducare.payroll.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PayrollDTO {

  private LocalDateTime datetime;
  private List<PayslipDTO> payslips;
  
  public PayrollDTO() {
    payslips = new ArrayList<>();
  }
  
  public LocalDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(LocalDateTime datetime) {
    this.datetime = datetime;
  }

  public List<PayslipDTO> getPayslips() {
    return payslips;
  }

  public void setPayslips(List<PayslipDTO> payslips) {
    this.payslips = payslips;
  }

}
