package com.ctseducare.payslip.dto;

public class PayslipDTO {

  private Integer id;
  private String name;
  private Double salary;
  private Double fgts;
  private Double inss;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getFgts() {
    return fgts;
  }

  public void setFgts(Double fgts) {
    this.fgts = fgts;
  }

  public Double getInss() {
    return inss;
  }

  public void setInss(Double inss) {
    this.inss = inss;
  }

}
