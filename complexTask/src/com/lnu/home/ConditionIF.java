package com.lnu.home;

public class ConditionIF {

    public void getValueOfX(double x){

        if(x<=0){
            System.out.println(0);
        }
        else if(x>0 && x<=1){
            System.out.println(x);
        }
        else{
            System.out.println(x*x);
        }
    }

    private Boolean isNumberCorrect(int number){
        if(number>99 && number<1000){
            return true;
        }
        else{
            return false;
        }
    }

    private int getFirstDigit(int number){
        int firstDigit = 0;

        while(number!=0){
            firstDigit=number%10;
            number/=10;
        }
        return firstDigit;
    }

    private int getLastDigit(int number){
        int lastDigit = number%10;
        return lastDigit;
    }

    public void compareFirstAndLastDigit(int number){
        if(isNumberCorrect(number)){
            int firstDigit = getFirstDigit(number);
            int lastDigit = getLastDigit(number);

            if(firstDigit > lastDigit){
                System.out.println(firstDigit + " bigger than "+lastDigit+" so first digit of a "+number+" is bigger");
            }
            else{
                System.out.println(firstDigit + " smaller than "+lastDigit+" so last digit of a "+number+" is bigger");
            }
        }
        else{
            System.out.println("Number is not correct");
        }
    }
}
