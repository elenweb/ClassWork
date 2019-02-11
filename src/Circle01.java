public class Circle01 {
    public static void main(String[] args) {
        Point o1 = new Point(3.0,5.0,"O");
        double r1 = 5.0;
        Circle c1 = new Circle (o1,r1);
        c1.printArea();
        c1.printCircle();
        c1.square();
    }
}
