
public class Circle extends Shape implements Colorable{
    private double radius = 0.0;
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color,boolean filled,  double radius) {
        super( color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return this.radius*Math.PI*2;
    }

    @Override
    double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString(){
        return "A Circle with radius = "+this.getRadius();
    }
    @Override
    public void howToColor() {
        super.howToColor();
    }
}
