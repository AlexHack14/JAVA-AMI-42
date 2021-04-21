package ua.edu.lnu.task.abstractclass;

public abstract class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract double salaryAccrual();
}
