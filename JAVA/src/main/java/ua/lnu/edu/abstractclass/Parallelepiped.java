package ua.lnu.edu.abstractclass;

public class Parallelepiped extends Figure {

    @Override
    public double volume(double x, double y, double z) {
        return x*y*z;
    }
}
