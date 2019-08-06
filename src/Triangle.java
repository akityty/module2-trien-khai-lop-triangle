public class Triangle extends Shape {
    private double t1 = 1;
    private double t2 = 1;
    private double t3 = 1;

    public Triangle(double t1, double t2, double t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public double getT3() {
        return t3;
    }

    public void setT3(double t3) {
        this.t3 = t3;
    }

    public Triangle(String color, boolean filled, double t1, double t2, double t3) {
        super(color, filled);
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
    public double getPerimeter(){
        return this.t1+this.t2+this.t3;
    }
    public double getArea(){
        double p =  getPerimeter()/2;
        return Math.sqrt(p*(p-t1)*(p-t2)*(p-t3));
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }
}
