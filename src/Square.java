public class Square extends Rectangle{
    private double side = 1.0;
    public Square(){

    }
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Square: side = "+this.getSide();
    }
    @Override
    public void howToColor() {
        super.howToColor();
    }
}
