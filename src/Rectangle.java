public class Rectangle {

    public static void main(String[] args) {
        Point a = new Point(2.0,5.0,"M");
        Point b = new Point(6.0,8.0,"N");
        Rect r = new Rect (a,b);
        r.drect();
        double d = r.diagonal();
        System.out.println(d);

    }
}
