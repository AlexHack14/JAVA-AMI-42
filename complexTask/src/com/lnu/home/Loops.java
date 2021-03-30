package com.lnu.home;

import java.util.ArrayList;

public class Loops {

    private double e = Math.E;

    private double getFunction(double x){
        return x*x-Math.pow(e,x)-2*x;
    }

    private ArrayList<Double> getFunctionInSteps(int a,int b,double h){
        double value = a;
        ArrayList<Double> y = new ArrayList<>();

        while(value<=b){
            double yValue = getFunction(value);
            y.add(yValue);
            value+=h;
        }

        return y;
    }

    private double getMaxY(ArrayList<Double> y){
        double maxValue = y.get(0);

        for(int i=1;i<y.size();i++){
            if(maxValue<y.get(i)){
                maxValue=y.get(i);
            }
        }

        return maxValue;
    }

    public void functionTabulation(int a,int b,double h){
        double value = a;
        ArrayList<Double> y = getFunctionInSteps(a,b,h);

        System.out.println("Tabulation: \n x \t y");
        for(int i=0;i<y.size();i++){

            System.out.println(value + "\t" + y.get(i));
            value+=h;
        }

        double maxValue = getMaxY(y);
        System.out.println("\nThe biggest value of function is : "+maxValue);
    }
}
