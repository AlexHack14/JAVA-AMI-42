package ua.edu.lnu.abstractclass;

public class MyVector extends MyArray {
    @Override
    public double norm(int[][] x) {
        double norma = 0;
        for (int i = 0; i < x.length; i++) {
            norma+=Math.pow(x[i][0],2);
        }
        return Math.sqrt(norma);
    }
}
