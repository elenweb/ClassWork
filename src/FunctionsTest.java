import java.util.Random;

public class FunctionsTest {
    static int[] a = new int[10]; //массив случайных чисел
    static int[] b = new int[]{2,1,1,1,1};

    public static void main(String[] args) {
        printMass(b);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt();
            printMass(b);
        }
        //printMass(new int [] {2,1,1,1,1,1,1,1,1,1});
    }
    private static void printMass(int[] x) {
        int l= x.length;
        System.out.print(x.length);
        System.out.print("[");
        for (int i = 0; i < l-1; i++) {
            System.out.print(x[i] + ", ");
        }
        System.out.print(x[l-1] + "]");
        System.out.println();
    }
}

