public class Sector {
    double angle;
    double radius;

    public Sector(double angle, double radius) {
        this.angle = angle;
        this.radius = radius;
    }
    public double areaSector() {
        return radius * radius * angle / (2 * Math.PI);
    }
    public double areaTri() {
        return radius * radius * Math.sin(angle) / 2;
    }
    public void printSector() {
        double s = radius * radius * angle / (2 * Math.PI);
        System.out.println("Площадь сектора круга радиуса " + radius + ", ограниченного углом " + angle + " равна" + s);
    }

}

