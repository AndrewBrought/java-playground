package shapes;
//It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//
//        Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:

public class Rectangle extends Quadrilateral implements Measurable{
//    protected double length;
//    protected double width;

    public Rectangle(double length, double width){
        super(length, width);

    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    public double getArea(){
//        return (length * 2) + (width * 2);
//    }
//
//    public double getPerimeter(){
//        return length * width;
//    }



}
