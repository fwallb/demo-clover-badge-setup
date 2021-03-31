import java.util.*;

public class geometry{

  public static String getType(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to geometry!\nPress A to calculate area and C to calculate circumference!");
    String type = sc.nextLine();

    while( !(type.equals("A") || type.equals("a") || type.equals("C") || type.equals("c"))) {
      System.out.println("Invalid choise. Plese select A for area or C for circumference!");
      type = sc.nextLine();
    }
    return type;
  }

  public static String getFigure(String type) {
    String figure = "";
    Scanner sc = new Scanner(System.in);

    if (type.equals("A") || type.equals("a")) {
      System.out.println("For which geometric figure do you want to calculate area?\nPress:\n- T for triangle\n- R for rectangle\n- C for circle!");
      figure = sc.nextLine();
      while (!(figure.equals("T") || figure.equals("R") || figure.equals("C") || figure.equals("t") || figure.equals("r") || figure.equals("c"))) {
        System.out.println("Invalid choise! Press:\n- T for triangle\n- R for rectangle\n- C for circle\n");
        figure = sc.nextLine();
      }
    }
    else if (type.equals("C") || type.equals("c")) {
      System.out.println("For which geometric figure do you want to calculate circumference?\nPress:\n- T for triangle\n- R for rectangle\n- S for square\n-C for circle!");
      figure = sc.nextLine();
      while (!(figure.equals("T") || figure.equals("R") || figure.equals("C") || figure.equals("t") || figure.equals("r") || figure.equals("c") || figure.equals("S") || figure.equals("s"))) {
        System.out.println("Invalid choise! Press:\n- T for triangle\n- R for rectangle\n- S for square\n- C for circle\n");
        figure = sc.nextLine();
      }
    }
    return figure;
  }

  public static double calculateArea(String figure){
    double result = 0;
    Scanner sc = new Scanner(System.in);

    if (figure.equals("T") || figure.equals("t")) {
      System.out.println("Please enter the length of the base: ");
      double b = sc.nextDouble();
      while(b <= 0) {
        System.out.println("Invalid input! Please enter the length of the base: ");
      }
      System.out.println("Please enter the height: ");
      double h = sc.nextDouble();
      while(h <= 0) {
        System.out.println("Invalid input! Please enter a vaild height: ");
      }
      result = area.triangle(b,h);
    }
    else if (figure.equals("R") || figure.equals("r")) {
      System.out.println("Please enter the length of one of the sides: ");
      double a = sc.nextDouble();
      while(a <= 0) {
        System.out.println("Invalid input! Please enter a valid length of the first side: ");
      }
      System.out.println("Please enter the length of the other side: ");
      double b = sc.nextDouble();
      while(b <= 0) {
        System.out.println("Invalid input! Please enter a valid length of the second side: ");
      }
      result = area.rectangle(a,b);
    }
    else if (figure.equals("C") || figure.equals("c")) {
      System.out.println("Please enter the radius: ");
      double radius = sc.nextDouble();
      while(radius <= 0) {
        System.out.println("Invalid input! Please enter a valid a valid radius: ");
      }
      result = area.circle(radius);
    }
    return result;
  }

  public static double calculateCircumference(String figure){
    double result = 0;
    Scanner sc = new Scanner(System.in);
    if (figure.equals("T") || figure.equals("t")) {
      System.out.println("Please enter the length of one of the sides: ");
      double a = sc.nextDouble();
      while(a <= 0) {
        System.out.println("Invalid input! Please enter a valid length of the first side: ");
      }
      System.out.println("Please enter the length of another side: ");
      double b = sc.nextDouble();
      while(b <= 0) {
        System.out.println("Invalid input! Please enter a valud length of the second side: ");
      }
      System.out.println("Please enter the length of the last side: ");
      double c = sc.nextDouble();
      while(c <= 0) {
        System.out.println("Invalid input! Please enter a valud length of the third side: ");
      }
      result = circumference.triangle(a,b,c);
    }
    else if (figure.equals("R") || figure.equals("r")) {
      System.out.println("Please enter the length of one of the sides: ");
      double a = sc.nextDouble();
      while(a <= 0) {
        System.out.println("Invalid input! Please enter a valid length for the first side: ");
      }
      System.out.println("Please enter the length of the other side: ");
      double b = sc.nextDouble();
      while(b <= 0) {
        System.out.println("Invalid input! Please enter a valid length for the second side: ");
      }
      result = circumference.rectangle(a,b);
    }
    else if (figure.equals("C") || figure.equals("c")) {
      System.out.println("Please enter the radius: ");
      double radius = sc.nextDouble();
      while(radius <= 0) {
        System.out.println("Invalid input! Please enter a valid length of the radius: ");
      }
      result = circumference.circle(radius);
    }
    else if (figure.equals("S") || figure.equals("s")) {
      System.out.println("Please enter the length of one of the sides: ");
      double a = sc.nextDouble();
      while(a <= 0) {
        System.out.println("Invalid input! Please enter a valid side length: ");
      }
      result = circumference.square(a);
    }
    return result;
  }

  public static void main(String args[]){
    String type = getType();
    String figure = getFigure(type);
    double final_result = 0;
    if (type.equals("A") || type.equals("a")) {
      final_result = calculateArea(figure);
    }
    else if (type.equals("C") || type.equals("c")) {
      final_result = calculateCircumference(figure);
    }
    System.out.println(final_result);
  }
}
