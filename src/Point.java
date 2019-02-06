public class Point {
    public String name;
    public double abs;
    public double ord;

    public void print() {
        System.out.println(name + "(" + abs + "; " + ord + ")");
    }

    public Point(double abs, double ord, String name) {
        this.name = name;
        this.abs = abs;
        this.ord = ord;
    }
}