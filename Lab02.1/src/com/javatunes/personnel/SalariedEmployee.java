/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import gov.irs.TaxPayer;

import java.sql.Date;

public class SalariedEmployee
extends Employee
{
  private Double salary;
  
  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, Date hireDate) {
    setName(name);
    setHireDate(hireDate);
  }
  
  public SalariedEmployee(String name, Date hireDate, Double salary) {
    this(name,hireDate);
    setSalary(salary);
  }
  public void pay(){
    System.out.printf("%s is paid salary %s", getName(), getSalary());
  }
  
  public Double getSalary() {
    return this.salary;
  }
  public void setSalary(Double salary) {
    this.salary = salary;
  }
  
  @Override
  public String toString() {
    return getClass().getSimpleName() + ": name=" + getName() + ", hireDate=" + getHireDate() + 
      ", salary=" + getSalary();
  }

  @Override
  public double payTaxes() {
    double taxes = getSalary() * SALARIED_TAX_RATE;
    System.out.println(getName() + " paid taxes of " + taxes);
    return taxes;
  }
}