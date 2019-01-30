package HomeWork;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int max = 20;
        int min = 1;
        int b = 0;  //граничное число для сравнения
        int d = max - min; //диапазон
        String c;
        System.out.println("Задумайте число от " + min + " до " + max);
        while (d > 1) {
            if (d % 2 == 1) {
                d = d - 1;
            }
            b = max - (d / 2);
            System.out.println("Ваше число больше " + b + "? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            switch (s) {
                case "да":
                case "y":
                    min = b + 1;
                    break;
                case "нет":
                case "n":
                    max = b;
                    break;
                default:
                    System.out.println("Можно отвечать только да (y) или нет (n)");
            }
            d = max - min;
           // System.out.println(min + "  " + max);
        }
        if (d == 1) {
            if (max % 2 == 1) {
                c = "нечетное";
            } else {
                c = "четное";
            }
            System.out.println("Это число " + c + "? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            switch (s) {
                case "да":
                case "y":
                    System.out.println("Вы задумали " + max);
                    break;
                case "нет":
                case "n":
                    System.out.println("Вы задумали " + min);
                    break;
                default:
                    System.out.println("Можно отвечать только да (y) или нет (n)");
            }
        } else {
            System.out.println("Вы задумали " + min);
        }
    }
}


