package com.lnu.home.apartment;

import java.util.Comparator;

public class ApartmentRoomComparator {

    public static Comparator<Apartment> roomComparator = new Comparator<Apartment>() {
        @Override
        public int compare(Apartment ap1, Apartment ap2) {

            if (ap1.getRooms() > ap2.getRooms()) {
                return 1;
            } else if (ap1.getRooms() < ap2.getRooms()) {
                return -1;
            } else {
                return 0;
            }
        }
    };
}
