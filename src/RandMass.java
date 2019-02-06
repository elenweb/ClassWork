import java.util.Random;
import java.util.Scanner;
/** Функция заполнения массива заданной длины случайными числами. */

public class RandMass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте количество элементов массива");
        int n = scanner.nextInt();
        double[] a = new double[n];
        rMass(a);
        printMass(a);

    }

    private static void rMass(double[] b) {
        Random r = new Random();
        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextDouble();
        }
    }

    public static void printMass(double[] b) {
        System.out.print("[");
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.print(b[b.length - 1] + "]");
    }

}

