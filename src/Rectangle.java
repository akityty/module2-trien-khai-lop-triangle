public class Rectangle extends Shape{
    private double width = 1.0;
    private double heigth = 1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    double getPerimeter() {
        return 2*(this.width+this.heigth);
    }

    @Override
    double getArea() {
        return this.heigth*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle: width = "+this.getWidth()+" height: "+this.getHeigth();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
