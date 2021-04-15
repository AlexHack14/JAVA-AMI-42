package com.lnu.home.apartment;

import java.io.IOException;

public class Apartment {

    private int rooms;
    private double price;
    private String cityLocation;

    //region Get-Set
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }
    //endregion

    public Apartment() {
    }

    public Apartment(int rooms, double price, String cityLocation) {
        this.rooms = rooms;
        this.price = price;
        this.cityLocation = cityLocation;
    }

    public void getSale() {
        System.out.println("Your sale is: " + getPrice() / 10);
        setPrice(getPrice() - (getPrice() / 10));
    }

    public void inputFieldsFromKeyboard() throws IOException {
        System.out.print("\nInput number of ROOMS: ");
        setRooms(MyExceptionHandling.handlingOFIncorrectExitFromMenuSupposeInt());
        System.out.print("\nInput price: ");
        setPrice(MyExceptionHandling.handlingOFIncorrectExitFromMenuSupposeDouble());
        System.out.println("\n Input Location");
        setCityLocation(MyExceptionHandling.handlingOFIncorrectExitFromMenuSupposeString());
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "rooms=" + rooms +
                ", price=" + price +
                ", cityLocation='" + cityLocation + '\'' +
                '}';
    }
}
