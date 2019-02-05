import java.util.Random;
import java.util.Scanner;


public class RandMass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество элементов массива");
        int n = scanner.nextInt();
        double[] a = new double[n];
        rMass(a, n);
        printMass(a, n);

    }

    private static void rMass(double[] b, int t) {
        Random r = new Random();
        for (int i = 0; i < t; i++) {
            b[i] = r.nextDouble();
        }
    }

    public static void printMass(double[] b, int t) {
        System.out.print("[");
        for (int i = 0; i < t - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.print(b[t - 1] + "]");
    }

}

