import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class СonditionalOperator {
    public static void taskConditionOne(int a, int b, int c){
        List<Integer> listOfABC = new ArrayList<Integer>();
        listOfABC.add(a);
        listOfABC.add(b);
        listOfABC.add(c);
        listOfABC.sort(Comparator.naturalOrder());
        c = listOfABC.get(0);
        b = listOfABC.get(1);
        a = listOfABC.get(2);
        System.out.println("a = " + a  + " b = " + b + " c = " + c);
    }
    public static void taskConditionSecond(double x){
        double res = x >= 1 ? (Math.cos(x)*Math.cos(x) - 6 * Math.sin(3*x)) : (Math.abs(Math.sin(x)) + 4 * Math.cos(x) + 4);
        System.out.println("result is " + res);
    }
}
