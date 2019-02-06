public class Circle {
    public Point center; // = new Point(2.0,5.0,"M");;
    public double radius; // = 1.0;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public void printArea() {
        double ar = radius * radius * Math.PI;
        System.out.println("Площадь круга радиуса " + radius + " равна " + ar);
    }

    public void printCircle() {
        double ar = radius * radius * Math.PI;
        System.out.println("Окружность радиуса " + radius + " с центром в точке " + center.name + "(" + center.abs + "; " + center.ord + ")");
    }

    public void square() {
        double x1 = center.abs - radius;
        double x2 = center.abs + radius;
        double y1 = center.ord - radius;
        double y2 = center.ord + radius;
        Point a = new Point(x1, y2, "A");
        Point b = new Point(x2, y2, "B");
        Point c = new Point(x2, y1, "C");
        Point d = new Point(x1, y1, "D");
        System.out.println("Окружность с центром в точке О(" + center.abs + "; " + center.ord + "), радмуса " + radius);
        System.out.println("можно вписать в квадрат с вершинами в точках:");
        a.print();
        b.print();
        c.print();
        d.print();
    }
}
