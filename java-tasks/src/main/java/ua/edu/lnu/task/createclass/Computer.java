package ua.edu.lnu.task.createclass;

public class Computer {
    private String name;
    private String model;
    private double price;

    /**
     * Default Constructor
     */
    public Computer() {
    }

    /**
     * Parameterized Constructor
     */

    public Computer(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    /**
     * Copy Constructor
     */
    public Computer(Computer computer) {
        this.name = computer.name;
        this.model = computer.model;
        this.price = computer.price;
    }

    public void showDetails() {
        System.out.println("Computer name :" + name + "\n" +
                "model :" + model + "\n" +
                "price :" + price + " грн");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
