package com.ctseducare.payslip.util;

public class PayslipCalculus {
  
  public static double fgts(double salary) {
    return salary * (0.08);
  }
  
  public static double inss(double salary) {
    double rateRange1 = 7.5 / 100.0;
    double rateRange2 = 9.0 / 100.0;
    double rateRange3 = 12.0 / 100.0;
    double rateRange4 = 14.0 / 100.0;
    
    double inss = 0.0;
    
    if (salary <= 1100.00) {
      inss = salary * rateRange1;
      
    } else if (salary <= 2203.48) {
      inss = 1100.00 * rateRange1;
      inss += (salary - 1100.00) * rateRange2;
      
    } else if (salary <= 3305.22) {
      inss = 1100.00 * rateRange1;
      inss += (2203.48 - 1100.00) * rateRange2;
      inss += (salary - 2203.49) * rateRange3;
      
    } else if (salary <= 6433.57) {
      inss = 1100.00 * rateRange1;
      inss += (2203.48 - 1100.00) * rateRange2;
      inss += (3305.22 - 2203.49) * rateRange3;
      inss += (salary - 3305.22) * rateRange4;
    } else {
      inss = 751.99;
    }
    
    return inss;
  }

}
