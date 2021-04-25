package ua.lnu.edu.classes;

import java.math.BigDecimal;

public class House {

    private int number;
    private String location;
    private double square;
    private BigDecimal price;

    public House() {
    }

    public House(int number, String location,double square, BigDecimal price) {
        this.number = number;
        this.location = location;
        this.square = square;
        this.price = price;
    }

    public House(House house) {
        this.number = house.number;
        this.location = house.location;
        this.square = house.square;
        this.price = house.price;
    }

    public double getPriceForHouse(double square, BigDecimal price) {
        return square * price.doubleValue();

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", location='" + location + '\'' +
                ", square=" + square +
                ", price=" + price +
                '}';
    }
}
