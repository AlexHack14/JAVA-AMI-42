package ua.lnu.edu.abstractclass;

public class Tetrahedron extends Figure {

    @Override
    public double volume(double x, double y, double z) {
        return x*y*z*Math.sqrt(2)/12;
    }
}
