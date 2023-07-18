package shapes;

import util.Input;

public class Circle {
    public static final Input input = new Input();
    private double radius;
    public final double pi = Math.PI;

    public void getRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = 2 * radius * pi;
        System.out.printf("The area of the circle is %s%n", area);
        return area;
    }

    public double getCircumference() {
        double circ = pi * (radius* radius);
        System.out.printf("The Circumference of the circle is %s%n", circ);
        return circ;
    }
}
