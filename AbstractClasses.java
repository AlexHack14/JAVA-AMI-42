package com.lnu;

public class AbstractClasses {

  public static void main(String[] args) {
    Employee hourlyEmployee = new HourlyEmployee();
    Employee departmentEmployee = new DepartmentEmployee();
    Employee interestRateEmployee = new InterestRateEmployee();

    System.out.println("Hourly employee: ");
    hourlyEmployee.inputSalary(35);

    System.out.println("Department employee: ");
    departmentEmployee.inputSalary(10000);

    System.out.println("Interest Rate Employee: ");
    interestRateEmployee.inputSalary(12);
  }
}


abstract class Employee {
  private int amountMoney;

  abstract void inputSalary(int salary);
}

class DepartmentEmployee extends Employee {

  @Override
  void inputSalary(int salary) {
    System.out.println("Salary: " + salary);
  }
}

class HourlyEmployee extends Employee {

  private int workedHours;

  public HourlyEmployee() {
    this.workedHours = 8*21;
  }

  public HourlyEmployee(int workedHours) {
    this.workedHours = workedHours;
  }

  @Override
  void inputSalary(int salary) {
    System.out.println("Salary: " + salary*workedHours);
  }
}

class InterestRateEmployee extends Employee {

  @Override
  void inputSalary(int salary) {
    System.out.println("Idk how to calculate it");
  }
}