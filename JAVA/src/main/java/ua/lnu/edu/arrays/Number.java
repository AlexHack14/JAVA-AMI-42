package ua.lnu.edu.arrays;

import java.util.Scanner;

public class Number {

    private static Scanner input = new Scanner(System.in);

    public void getSomeElementsOfArray(int[] arr){
        System.out.print("Enter M: ");
        int M = input.nextInt();
        int L=0;
        do {
        System.out.print("Enter L: ");
        L = input.nextInt();
        } while (L<0 && L>M-1);

        for (int i=0;i<arr.length;i++) {
            if(arr[i] % M == L) {
                System.out.println(arr[i]);
            }
        }
    }
}
