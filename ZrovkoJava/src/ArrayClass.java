import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayClass {
    static public void arrayTaskOne(double[] mas){
        List<Double> ell = IntStream.range(0,mas.length).filter(i -> i % 2 == 0).mapToObj(i-> mas[i]).collect(Collectors.toList());
        System.out.print(" result is " + ell.stream().mapToDouble(Double::doubleValue).max().getAsDouble());
    }
}
