package ua.edu.lnu.task.abstractclass;

public class FullTimeEmployee extends Employee {
    private final int workingDays = 20;
    private int salaryPerDay;

    public FullTimeEmployee(String name, String surname, int salaryPerDay) {
        super(name, surname);
        this.salaryPerDay = salaryPerDay;
    }

    public double salaryAccrual() {
        return workingDays * salaryPerDay;
    }
}
