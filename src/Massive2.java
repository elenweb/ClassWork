import java.util.Random;
import java.util.Scanner;

public class Massive2 {
    public static void main(String[] args) {
        int[] a = new int[10]; //массив случайных чисел
        int[] k = new int[10]; //массив загаданных чисел
        boolean[] b = new boolean[10];
        int i = 0; // номер в массиве
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите " + (i + 1) + "-е число от 1 до 10");
        while (i < 10) {
            int n = r.nextInt(10);
            a[i] = n+1;
            int s = scanner.nextInt();
            k[i] = s;
            b[i] = a[i] == s;
            if (i < 9) {
                System.out.println("Введите " + (i + 1) + "-е число от 1 до 10");
            } else {
                System.out.println("Совпадения:");
            }
            i++;
        }
        i = 0;
        for (i = 0; i < 10; i++) {
            if (b[i]) {
                System.out.println((i + 1) + "-е число " + "вы загадали " + k[i] + ", угадано )) " + a[i]);
            } else {
                System.out.println((i + 1) + "-е число " + "вы загадали " + k[i] + " не угадано (( " + a[i]);
            }
        }
    }
}
