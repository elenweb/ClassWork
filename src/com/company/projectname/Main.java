package com.company.projectname;
//www.company.com
// тире заменяется на знак подчеркивания a-sign => a_sign

import com.company.myClasses.Point;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       // Point p1 = new Point(10.0, 20.0);
       // Point p2 = new Point(20.0, 40.0);

        LinkedList list = new LinkedList();
        Scanner s = new Scanner(System.in);
        System.out.println("Добавить точки? y/n");
        String answer = s.next();

        while (answer.equals("y")) {
            System.out.println("Введите Х");
            int x = s.nextInt();
            System.out.println("Введите Y");
            int y = s.nextInt();
            System.out.println("Введите имя точки");
            String dot = s.next();
            Point point = new Point(x, y, dot);
            list.add(point);
            System.out.println("Еще? y/n");
            answer = s.next();
        }
        System.out.println("list = " + list); //выводит название класса и адрес, вызывает метод toString
       int x= 12;
        f(x, list);
        System.out.println("list = " + list);
    }
public static void  f(int x, LinkedList l){
    x=2000;
    System.out.println("x=" + x);
    l.add("abc");
    }

}
