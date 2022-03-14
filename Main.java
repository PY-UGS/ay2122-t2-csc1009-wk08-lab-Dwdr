import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
        input.close();
        if (radius < 0) {
            throw new IllegalArgumentException("Radius is less than 0");
        } else {
            CircleWithException Circle = new CircleWithException(radius);
          //  double radius = Circle.getRadius();
            double area = Circle.getArea();
            double diameter = Circle.getDiameter();
            try {
                AreaValue(area);
                System.out.println("Area: " + area);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static boolean AreaValue(double area) throws Exception
    {
        if (area > 1000) throw new Exception("Area is more than 1000");
        return true;
    }
}