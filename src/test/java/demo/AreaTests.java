package demo;

import org.junit.Assert;
import org.junit.Test;

public class AreaTests {

  @Test
  public void checkAreaCalculatedCorrectly(){
    double b = 10;
    double h = 20;
    double actual = Area.triangle(b,h);
    double expected = 100;
    Assert.assertEquals(0, Double.compare(expected, actual));
  }

}
