package com.lnu.home.apartment;

import java.util.Comparator;

public class ApartmentPriceComparator {

    public static Comparator<Apartment> priceComparator = new Comparator<Apartment>() {
        @Override
        public int compare(Apartment ap1, Apartment ap2) {

            if (ap1.getPrice() > ap2.getPrice()) {
                return 1;
            } else if (ap1.getPrice() < ap2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        }
    };
}
