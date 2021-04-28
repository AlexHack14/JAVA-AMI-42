package ua.edu.lnu.function;

public class Function {

    private boolean isOddNumber(int n) {
        return n % 2 == 0 ? false : true;
    }

    private boolean isDigitOdd(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (!isOddNumber(rem)) {
                count++;
            }
            n = n / 10;
        }
        return count == 0 ? true : false;
    }

    private int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }

    public void getResult(int number) {
        int sum = 0;
        if (isDigitOdd(number)) {
            sum = sumDigits(number);
            System.out.println("The sum of number: "+ sum);
        } else {
            System.out.println("The number contains even digits");
        }

    }
}
