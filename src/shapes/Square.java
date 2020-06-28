package shapes;

public class Square extends Quadrilateral{

    public Square(double side){
        super(side, side);
    }

    @Override
    void setLength(double side) {
        this.length = side;
    }

    @Override
    void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return (4 * width);
    }

    @Override
    public double getArea() {
        return length * length;
    }

//    @Override
//    public double getArea() {
//        return length * length;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return (2 * length) + (2 * length);
//    }




}
