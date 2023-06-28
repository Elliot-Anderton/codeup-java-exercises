package shapes;


class Square extends Quadrilateral {
    public Square (double side) {
        this.length = side;
        this.width = side;
    }


    public double getArea(){
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
//
//    public Square(int side) {
//        super(side, side);
//    }
//
//    public double getArea(){
//        System.out.println("Square method was used");
//        double side = this.length;
//        return side * side;
//    }
//
//    public double getPerimeter() {
//        System.out.println("Square method was used");
//        double side = this.length;
//        return 4 * side;
//    }
}
