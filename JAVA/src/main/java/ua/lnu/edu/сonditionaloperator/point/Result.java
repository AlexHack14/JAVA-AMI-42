package ua.lnu.edu.сonditionaloperator.point;

public class Result {

    public double distanceSearch(Point A, Point B) {
        return Math.sqrt(Math.pow(B.getX()- A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
    }

    public void getTheNearestPointToA(Point A, Point B, Point C){
        if(distanceSearch(A,B) < distanceSearch(A,C)) {
            System.out.println("B is the nearest point");
        } else if (distanceSearch(A,B) > distanceSearch(A,C)) {
            System.out.println("C is the nearest point");
        } else {
            System.out.println("The same distance between AB and AC");
        }
    }
}
