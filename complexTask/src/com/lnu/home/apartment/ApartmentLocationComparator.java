package com.lnu.home.apartment;

import java.util.Comparator;

public class ApartmentLocationComparator {

    public static Comparator<Apartment> locationComparator = new Comparator<Apartment>() {
        @Override
        public int compare(Apartment ap1, Apartment ap2) {
            String location1 = ap1.getCityLocation().toUpperCase();
            String location2 = ap2.getCityLocation().toUpperCase();

            return location1.compareTo(location2);

        }
    };
}
