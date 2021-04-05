import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void taskOneLoops(double a, double b, double h){
        List<Double> listOfY = new ArrayList<Double>();
        double maxSum = 0, maxMult = 1;
        System.out.println("TABLE");
        for (double i = a; i <= b; i += h){
            System.out.print("x = " + i);
            listOfY.add(Math.sin(i) + 0.5 * Math.cos(i));
            System.out.println(" y = " + listOfY.get(listOfY.size() - 1));
        }
        for(double el :listOfY){
            if(el < 0)
            {
                maxSum += el;
                maxMult *= el;
            }
        }
        System.out.println("Max Sum = " + maxSum + " Max Mult = " + maxMult);
    }
    public  static void taskTwoLoops(double a, int n)
    {
        double P = a;
        for(int i = 1; i < n; i++){
            P *= (a+i);
        }
        System.out.println("P = " + P);
    }

}
