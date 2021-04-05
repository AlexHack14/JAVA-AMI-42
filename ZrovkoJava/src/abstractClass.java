abstract class Curve{
    double x;
    Curve(double x)
    {
        this.x = x;
    }
    public abstract double getY();
}
class StraightClass extends Curve{
    double a,b;
    StraightClass(double x, double a, double b){
        super(x);
        this.a = a;
        this.b = b;
    }
    public double getY()
    {
        return a*x+b;
    }
}
class ParabolaClass extends StraightClass{
    double c;
    ParabolaClass(double x, double a, double b, double c){
        super(x,a,b);
        this.c = c;
    }
    public double getY()
    {
        double y = super.getY();
        return y+c;
    }
}
class CircleClass extends StraightClass{
    double r;

    CircleClass(double x, double a, double b, double r) {
        super(x, a, b);
        this.r = r;
    }

    public double getY() {
        return b + Math.sqrt(r*r - (x - a)*(x - a));
    }
}