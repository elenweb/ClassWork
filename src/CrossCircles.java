import java.util.Scanner;

public class CrossCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
       /*  double[] x = new double[2]; //абсциссы центров окружностей
        double[] y = new double[2]; //ординаты центров окружностей
        double[] r = new double[2]; //радиусы

        for (i = 0; i < 2; i++) {
            System.out.println("Задайте параметры " + (i + 1) + "-й окружности");
            System.out.println("1. КООРДИНАТЫ ЦЕНТРА");
            System.out.println("Х - абсцисса (десятичное число с разделителем запятой):");
            double s1 = scanner.nextDouble();
            x[i] = s1;
            System.out.println("У - ордината (десятичное число с разделителем точкой):");
            double s2 = scanner.nextDouble();
            y[i] = s2;
            System.out.println("2. РАДИУС");
            System.out.println("Введите десятичное число (с разделителем точкой):");
            double s3 = scanner.nextDouble();
            r[i] = s3;
        }

        double x1 = x[1];
        double y1 = y[1];
        double x2 = x[2];
        double y2 = y[2];
        double rad1 = r[1];
        double rad2 = r[2];  */

        double x1 = 8.0;
        double y1 = 10.0;
        double x2 = 15.0;
        double y2 = 4.0;
        double rad1 = 8.0;
        double rad2 = 3.0;
        double rmax = Math.max(rad1, rad2);
        double rmin = Math.min(rad1, rad2);
        Point o1 = new Point(x1, y1, "O1");
        Point o2 = new Point(x2, y2, "O2");
        Circle c1 = new Circle(o1, rad1);
        Circle c2 = new Circle(o2, rad2);
        c1.printCircle();
        c2.printCircle();
        System.out.println("Больший радиус равен " + rmax);
        System.out.println("Меньший радиус равен " + rmin);
        Rect dist = new Rect(o1, o2);
        double d = dist.diagonal(); // расстояние между центрами окружносте
        System.out.println("Расстояние между центрами окружностей равно " + d);
        double sCross; //площадь пересечения
        double h = (rmax * rmax - rmin * rmin + d * d) / (2 * d);
        // расстояние от центра бОльшей окружности до середины общей хорды двух окружностей
        double ang1 = 2 * Math.acos(h / rmax);
        double ang2 = 2 * Math.acos(h / rmin);
        Sector sec1 = new Sector(ang1, rmax);
        Sector sec2 = new Sector(ang2, rmin);

        if (d <= (rmax - rmin)) {
            sCross = rmin * rmin * Math.PI;
            System.out.println("Одна окружность располагается внутри другой");
        } else {
            if (d >= (rad1 + rad2)) {
                System.out.println("Окружности не пересекаются");
                sCross = 0.0;
            } else {
                System.out.println("Расстояние от центра большей окружности до общей хорды равно " + h);
                if (h < d) {
                    sCross = sec1.areaSector() + sec2.areaSector() - sec1.areaTri() - sec2.areaTri();
                } else {
                    sCross = Math.min(c1.area(), c2.area()) - sec2.areaSector() + sec2.areaTri() + sec1.areaSector() - sec1.areaTri();
                }
            }
            System.out.println("Площадь пересечения равна " + sCross);
        }
    }
}

