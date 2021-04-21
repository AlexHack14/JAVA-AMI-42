package ua.edu.lnu.task.conditionaloperator.squarefigure;

/***
 * Задано радіус круга і сторона квадрата. Визначити, у якої з фігур більша площа?
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.square());

        Square square = new Square(5);
        System.out.println(square.square());

        comparisonAreas(square.square(),circle.square());
    }

    public static void comparisonAreas(double squareArea, double squareCircle) {
        if (squareArea>squareCircle){
            System.out.println("Large square area");
        }else if(squareArea<squareCircle){
            System.out.println("Larger area of the circle");
        }else {
            System.out.println("Areas are equal");
        }
    }
}
