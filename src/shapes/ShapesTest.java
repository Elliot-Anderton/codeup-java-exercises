package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myshape;

        myshape = new Rectangle(5, 4);
        System.out.println("myshape.getArea() = " + myshape.getArea());
        System.out.println("myshape.getPerimeter() = " + myshape.getPerimeter());

        myshape = new Square(5);
        System.out.println("myshape.getArea() = " + myshape.getArea());
        System.out.println("myshape.getPerimeter() = " + myshape.getPerimeter());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        Square box2 = new Square(5);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
    }
}
