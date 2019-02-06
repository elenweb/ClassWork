public class Rect {
    public Point p1 = new Point(1.0, 1.0, "A");
    public Point p2 = new Point(5.0, 4.0, "C");

    public void drect() {
        double d = Math.sqrt((p2.abs - p1.abs) * (p2.abs - p1.abs) + (p2.ord - p1.ord) * (p2.ord - p1.ord));
        System.out.println("Длина диагонили " + p1.name + "(" + p1.abs + "; " + p1.ord + ") - " + p2.name + "(" + p2.abs + "; " + p2.ord + ")" + " прямоугольника равна " + d);
    }
    public double diagonal(){
        return Math.sqrt((p2.abs - p1.abs) * (p2.abs - p1.abs) + (p2.ord - p1.ord) * (p2.ord - p1.ord));
    }

    public Rect(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
