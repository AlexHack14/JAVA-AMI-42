package ua.edu.lnu.task.conditionaloperator.squarefigure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        return Math.pow(side, 2);
    }
}
