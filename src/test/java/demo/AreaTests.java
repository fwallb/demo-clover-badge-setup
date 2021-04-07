package demo;

import org.junit.Assert;
import org.junit.Test;
import java.lang.Math;

public class AreaTests {

  @Test
  public void checkTriangleAreaCalculatedCorrectly(){
    double b = 10;
    double h = 20;
    double actual = Area.triangle(b,h);
    double expected = 100;
    Assert.assertEquals(0, Double.compare(expected, actual));
  }

  @Test
  public void checkCircleAreaCalculatedCorrectly(){
    double radius = 10;
    double expected = Math.PI * Math.pow(radius, 2);
    double actual = Area.circle(radius);
    Assert.assertEquals(0, Double.compare(expected, actual));
  }

  @Test
  public void checkRectangleAreaCalculatedCorrectly(){
    double a = 10;
    double b = 20;
    double expected = 200;
    double actual = Area.rectangle(a, b);
    Assert.assertEquals(0, Double.compare(expected, actual));
  }

}
