public class CircleWithException {
    private double radius, area, diameter;
    final double PI = 3.1415;

    public CircleWithException(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        area = PI*radius*radius;
        return area;
    }

    public double getDiameter(){
        diameter = radius*2;
        return diameter;
    }
}
