package ua.edu.lnu.conditionaloperator.function;

public class Function {

   private static double f1(double x){
        return -Math.pow(x,2);
    }

    private static double f2(double x) {
        return Math.pow(2,x)/(Math.pow(x,2)+1);
    }

    public double getFunction(double x){
        if(x >= 7) {
            return f1(x);
        } else {
            return f2(x);
        }
    }
}
