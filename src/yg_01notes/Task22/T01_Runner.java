package yg_01notes.Task22;

import java.awt.*;

public class T01_Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan T01_Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */


    public static void main(String[] args) {
        T01_Rectangle r = new T01_Rectangle(5, 10);
        System.out.println("Width: " + r.getWidth());
        System.out.println("Length: " + r.getLength());
        System.out.println("Perimeter: " + r.calculatePerimeter());
        System.out.println("Area: " + r.calculateArea());
    }
}
