package shapes;

class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public double getArea(){
        System.out.println("Square method was used");
        double side = this.length;
        return side * side;
    }

    public double getPerimeter() {
        System.out.println("Square method was used");
        double side = this.length;
        return 4 * side;
    }
}
