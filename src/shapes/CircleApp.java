package shapes;

import static shapes.Circle.input;

public class CircleApp {
    public static void main(String[] args) {
        boolean cont;
        int i = 0;

        do {
            Circle circle = new Circle();

            double userRad = input.getDouble("What is the radius of the circle?");
            circle.getRadius(userRad);

            circle.getArea();
            circle.getCircumference();


            cont = input.yesNo("Would you like to continue?");
            i++;
        } while (cont);
        System.out.printf("%s circles created", i);
    }
}
