package demo;

import java.lang.Math;

public class Area{

    public static double triangle(double base, double height){
      return (base*height)/2;
    }

    public static double rectangle(double base, double height) {
      return base*height;
    }

    public static double circle(double radius) {
      return Math.PI*Math.pow(radius,2);
    }

}
