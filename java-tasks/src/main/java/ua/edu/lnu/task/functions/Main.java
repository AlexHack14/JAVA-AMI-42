package ua.edu.lnu.task.functions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/***
 * Дано координати вершин трьох трикутників. Надрукувати координати вершин трикутника із більшою площею.
 * Створити функції для знаходження площі трикутника та віддалі між двома точками.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(1, 2), new Point(3, 3), new Point(3, 12));
        Triangle triangle2 = new Triangle(new Point(2, 3), new Point(5, 6), new Point(8, 12));
        Triangle triangle3 = new Triangle(new Point(1, 2), new Point(4, 5), new Point(4, 6));

        Triangle triangle = largestArea(triangle1, triangle2, triangle3);
        System.out.println(triangle);

    }

    public static Triangle largestArea(Triangle triangle1, Triangle triangle2, Triangle triangle3) {
        List<Triangle> triangles = Arrays.asList(triangle1, triangle2, triangle3);
        double[] result = {triangle1.square(), triangle2.square(), triangle3.square()};
        OptionalDouble max = Arrays.stream(result).max();
        double asDouble = max.getAsDouble();
        for (Triangle triangle : triangles) {
            if (triangle.square() == asDouble) {
                return triangle;
            }
        }
        return null;
    }
}
