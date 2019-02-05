public class Function1 {


   /* public static int sum(int a, int b) {
       int c = a + sum(a,b);
   return c;
   }
   public static void main(String[] args) {
       int x1 = 5;
       int x2 = 3;
          int x3 = sum(x1, x2);
        System.out.println("x3 = " + x3);
        System.out.println("sin(0) = " + Math.sin(x3));
    }  */

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(a));
    }
}