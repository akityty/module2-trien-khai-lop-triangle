public class Main {
    public static void main(String[] args) {

        Shape[] geometric = new Shape[4];
        geometric[0] = (Circle) new Circle(1.2);
        geometric[1] = (Rectangle) new Rectangle(1.2,3.3);
        geometric[2] = (Square) new Square(3.3);
        geometric[3] = (Triangle) new Triangle(1,2,3);

        for (int i = 0; i<geometric.length; i++){
            System.out.println(geometric[i].getPerimeter());
            geometric[i].howToColor();
        }
    }
}
