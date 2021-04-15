package com.lnu.home.apartment;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ApartmentMenu {

    public static List<Apartment> apartmentList = ApartmentCollection.getObjectsOfCollection();
    int consoleChoice;

    public void callMenu() throws IOException {

        Boolean flag = true;

        while (flag) {
            System.out.println("\n----------------------------------------------------");
            System.out.println("1)Add info about new Apartment");
            System.out.println("2)Show list of existing Apartments");
            System.out.println("3)Sort List by ROOMS");
            System.out.println("4)Sort List by PRICE");
            System.out.println("5)Sort List by LOCATION");
            System.out.println("6)Get sale for some apart");
            System.out.println("");
            System.out.println("----------------------------------------------------");

            consoleChoice = MyExceptionHandling.handlingOFIncorrectExitFromMenuSupposeInt();

            switch (consoleChoice) {

                case 1:
                    Apartment newApart = new Apartment();
                    newApart.inputFieldsFromKeyboard();
                    apartmentList.add(newApart);
                    System.out.println("apartment added to LIST");
                    break;
                case 2:
                    System.out.println(apartmentList);
                    break;
                case 3:
                    Collections.sort(apartmentList, ApartmentRoomComparator.roomComparator);
                    System.out.println("Sorted by rooms:" + apartmentList);
                    break;
                case 4:
                    Collections.sort(apartmentList, ApartmentPriceComparator.priceComparator);
                    System.out.println("Sorted by price:" + apartmentList);
                    break;
                case 5:
                    Collections.sort(apartmentList, ApartmentLocationComparator.locationComparator);
                    System.out.println("Sorted by location:" + apartmentList);
                    break;
                case 6:
                    System.out.println("Pick number of apartment for sale");
                    int pickApartmentForSale = MyExceptionHandling.handlingOFIncorrectExitFromMenuSupposeInt();
                    apartmentList.get(pickApartmentForSale).getSale();
                    break;
                case 42:
                    break;
                default:
                    flag = !flag;
                    break;
            }
        }
    }
}
