public class TryClass {

    public static void main(String[] args) {
        Point a=new Point(2, 4, "A");
       //  a.abs = 0.5;
       // a.ord = 2;
       //  a.name = "A";
      //  System.out.println("A(" + a.abs + "; " + a.ord + ")");
        a.print();
        a.abs=10;
        System.out.println(a.abs);
        System.out.println(a.ord);
    }
    }
