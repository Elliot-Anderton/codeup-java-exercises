package shapes;

import util.Input;

public class Circle {
    public static final Input input = new Input();
    private double radius;
    public final double pi = Math.PI;
    private static int i = 0;

    public static void iterator() {
        ++i;
    }

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

    public static void circleApp() {
        boolean cont;

        do {
            Circle circle = new Circle();

            double userRad = input.getDouble("What is the radius of the circle?");
            circle.getRadius(userRad);

            circle.getArea();
            circle.getCircumference();


            cont = input.yesNo("Would you like to continue?");
            iterator();
        } while (cont);
        System.out.printf("%s circles created", i);
    }

    public static void main(String[] args) {
        circleApp();
    }
}
