import java.lang.Math;

public class circumference{

  public static double triangle(double a, double b, double c){
    return a+b+c;
  }

  public static double rectangle(double a, double b) {
    return 2*a+2*b;
  }

  public static double square(double a){
    return a*4;
  }

  public static double circle(double radius){
    return 2*radius*Math.PI;
  }
  
}
