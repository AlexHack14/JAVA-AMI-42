package com.lnu.home;

import com.lnu.home.abstractCurve.Circle;
import com.lnu.home.abstractCurve.Curve;
import com.lnu.home.abstractCurve.Line;
import com.lnu.home.abstractCurve.Parabola;
import com.lnu.home.apartment.ApartmentMenu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Task1 : LOOPS :
        Loops loops = new Loops();
        loops.functionTabulation(0, 10, 0.5);
        loops.sumElementsRaisedToDegree(2, 10);

        //Task2 : FUNCTIONS :
        FunctionsMatrix fm = new FunctionsMatrix();
        fm.compareTreeMatrix(3, 2);

        //Task3 : CONDITIONS :
        ConditionIF cif = new ConditionIF();
        cif.getValueOfX(0);
        cif.getValueOfX(1);
        cif.getValueOfX(2);

        cif.compareFirstAndLastDigit(339);

        //Task4 : ARRAYS :
        ArrayOperation ao = new ArrayOperation();
        int[] array = {2, 1, 3, 4, 5, 4, 3, 2, 5, 4, 3, 6, 2, 2, 4, 5};
        ao.replaceOperation(array, 4);

        //Task5 : CLASS :
        ApartmentMenu menu = new ApartmentMenu();
        menu.callMenu();

        //Task6 : ABSTRACT :
        Curve line = new Line(2,1,3);
        Curve parabola = new Parabola(2,1,5,9);
        Curve circle = new Circle(0,0,0,5);
        System.out.println(line);
        System.out.println(parabola);
        System.out.println(circle);
    }
}
