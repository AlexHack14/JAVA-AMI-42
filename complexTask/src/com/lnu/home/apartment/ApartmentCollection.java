package com.lnu.home.apartment;

import java.util.ArrayList;

public class ApartmentCollection {

    public static ArrayList<Apartment> getObjectsOfCollection() {
        ArrayList<Apartment> apartments = new ArrayList<>();

        Apartment apartment1 = new Apartment(2, 10000, "Mukachevo");
        Apartment apartment2 = new Apartment(1, 15200, "Chernivci");
        Apartment apartment3 = new Apartment(1, 33000, "Kyiv");
        Apartment apartment4 = new Apartment(3, 90000, "Lviv");
        Apartment apartment5 = new Apartment(2, 45000, "Kharkiv");

        apartments.add(apartment1);
        apartments.add(apartment2);
        apartments.add(apartment3);
        apartments.add(apartment4);
        apartments.add(apartment5);

        return apartments;
    }
}
