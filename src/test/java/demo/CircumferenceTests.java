package demo;

import org.junit.Assert;
import org.junit.Test;

public class CircumferenceTests {

  @Test
  public void checkTriangleCircumference() {
    double a = 10;
    double b = 20;
    double c = 30;
    double actual = Circumference.triangle(a,b,c);
    double expected = 10+20+30;
    Assert.assertEquals(Double.compare(actual,expected),0);
  }

  @Test
  public void checkCircleCircumference() {
    double radius = 20;
    double expected = 2 * Math.PI * 20;
    double actual = Circumference.circle(radius);
    Assert.assertEquals(Double.compare(expected, actual), 0);
  }

  @Test
  public void checkSquareCircumference() {
    double a = 10;
    double expected = 10*4;
    double actual = Circumference.square(a);
    Assert.assertEquals(Double.compare(expected, actual), 0);
  }

  @Test
  public void checkRectangleCircumference() {
    double a = 10;
    double b = 20;
    double expected = 10*2+20*2;
    double actual = Circumference.rectangle(a,b);
    Assert.assertEquals(Double.compare(expected, actual), 0);
  }

}
