package ua.edu.lnu;

import ua.edu.lnu.abstractclass.Matrix;
import ua.edu.lnu.abstractclass.MyArray;
import ua.edu.lnu.abstractclass.MyVector;
import ua.edu.lnu.arrays.Numbers;
import ua.edu.lnu.classes.HouseholdAppliances;
import ua.edu.lnu.conditionaloperator.function.Function;
import ua.edu.lnu.conditionaloperator.number.Num;
import ua.edu.lnu.cycle.Cycle;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    private static void printMenu() {
        System.out.println("\nMenu:\n");
        System.out.println("'1' - Determine whether the sum of its first two digits is equal to the sum of its last two digits?");
        System.out.println("'2' - Function");
        System.out.println("'3' - Tabulation");
        System.out.println("'4' - Find sum");
        System.out.println("'5' - Create a new sequence by throwing elements from the original sequence that are equal to the smallest element of the array.");
        System.out.println("'6' - Calculate the sum of all significant numbers that represent only incomplete digits.");
        System.out.println("'7' - Print Household Appliances");
        System.out.println("'8' - Print the norm for vector or matrix");
        System.out.println("'Q' - Exit");
        System.out.print("Please, select menu point: ");

    }

   private static void outputMenu() {
        boolean exit = true;
        while (exit) {
            printMenu();
            switch (input.next()) {
                case "1": {
                    printFourDigitNumber();
                    break;
                }
                case "2": {
                    printFunction();
                    break;
                }
                case "3":{
                    printTabulation();
                    break;
                }
                case "4": {
                    printS();
                    break;
                }
                case "5": {
                    printArray();
                    break;
                }
                case "6": {
                    printSumIfOddDigit();
                    break;
                }
                case "7": {
                    printHouseholdAppliances();
                    break;
                }
                case "8": {
                    printNorm();
                    break;
                }
                case "Q": {
                    exit = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    private static void printFourDigitNumber() {
        System.out.print("Enter four-digit number: ");
        int number = input.nextInt();

        Num num = new Num();
        num.getNumber(number);
    }

    private static void printFunction() {
        System.out.print("Enter x: ");
        int x = input.nextInt();

        Function function = new Function();
        System.out.println("F(x) = " + function.getFunction(x));
    }

    private static void printTabulation() {
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.println("[a,b]:"+"["+a+", "+b+"]");
        System.out.print("Enter h: ");
        int h = input.nextInt();

        Cycle cycle = new Cycle();
        cycle.tabulation(a,b,h);
    }

    private static void printS() {
        System.out.print("Enter n: ");
        double n = input.nextDouble();

        Cycle cycle = new Cycle();
        System.out.println("S = "+ cycle.getS(n));
    }

    private static void printArray() {
        int[] a = {-4,0, 34,-3,-4,450};
        System.out.println(Arrays.toString(a));

        Numbers numbers = new Numbers();
        System.out.println(numbers.getResult(a));
    }

    private static void printSumIfOddDigit() {
        ua.edu.lnu.function.Function function = new ua.edu.lnu.function.Function();
        System.out.print("Enter number: ");
        int n = input.nextInt();
        function.getResult(n);
    }

    private static void printHouseholdAppliances() {
        HouseholdAppliances householdAppliances1 = new HouseholdAppliances("Microwaves", new BigDecimal(2343), "kitchen");
        HouseholdAppliances householdAppliances2 = new HouseholdAppliances("Shower Systems", new BigDecimal(2023), "bath");
        HouseholdAppliances householdAppliances3 = new HouseholdAppliances("Sink", new BigDecimal(542), "bath");
        HouseholdAppliances[] householdAppliances = {householdAppliances1,householdAppliances2,householdAppliances3};

        System.out.println("1 - bath");
        System.out.println("2 - kitchen");
        System.out.print("Could you choose number,please?: ");
        int n = input.nextInt();

        String type = n == 1 ? "bath" : "kitchen";
        filterByType(householdAppliances,type);

    }

    private static void filterByType(HouseholdAppliances[] householdAppliances, String type){
        for (int i = 0; i < householdAppliances.length; i++) {
            if(householdAppliances[i].getType().equals(type)) {
                System.out.println(householdAppliances[i].show());
            }
        }
    }

    private static void printNorm() {
        MyArray vector = new MyVector();
        MyArray matrix = new Matrix();
        int[][] m = {{2,3},{1,4},{2,1}};
        int[][] v = {{3,0},{4,0},{1,0}};
        System.out.println("The norm for the vector: "+vector.norm(v));
        System.out.println("The norm for the matrix: "+matrix.norm(m));
    }
    public static void main(String[] args) {
        outputMenu();
    }

}
