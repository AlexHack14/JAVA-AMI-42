package ua.edu.lnu.task.abstractclass;

public class EmployeeWithInterestRate extends Employee {
    private int discharge;

    public EmployeeWithInterestRate(String name, String surname, int discharge) {
        super(name, surname);
        this.discharge = discharge;
    }

    public double salaryAccrual() {
        return ((0.09 * (discharge-1)) + 1) * 2670;
    }
}