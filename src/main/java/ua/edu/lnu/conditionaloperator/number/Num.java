package ua.edu.lnu.conditionaloperator.number;

public class Num {

    private int sum(int a, int b) {
        return a+b;
    }

    public void getNumber(int number) {
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number/100) % 10;
        int d = number/1000;

        int sumAB = sum(a,b);
        int sumCD = sum(c,d);

        if(sumAB < sumCD ) {
            System.out.println("The sum of the first two numbers is greater than the sum of the last two digits ");
        } else if (sumAB > sumCD) {
            System.out.println("The sum of the first two numbers is less than the sum of the last two digits");
        } else  {
            System.out.println("The sum of the first two numbers is equal to the sum of the last two digits");
        }
    }
}
