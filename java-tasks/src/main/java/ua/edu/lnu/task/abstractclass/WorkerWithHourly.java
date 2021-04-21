package ua.edu.lnu.task.abstractclass;

public class WorkerWithHourly extends Employee {
    private int pricePerHour;
    private int numberHours;

    public WorkerWithHourly(String name, String surname, int pricePerHour, int numberHours) {
        super(name, surname);
        this.pricePerHour = pricePerHour;
        this.numberHours = numberHours;
    }

    public double salaryAccrual() {
        return pricePerHour * numberHours;
    }
}
