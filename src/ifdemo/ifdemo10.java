package ifdemo;

import java.util.Scanner;

public class ifdemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) System.out.println("是等边三角形");
            else if (b * b == a * a + c * c || a * a + b * b == c * c || b * b + c * c == a * a)
                System.out.println("是直角三角形");
            else if (a != b && b != c && a != c) System.out.println("是普通三角形");
            else System.out.println("是等腰三角形");
        } else System.out.println("不构成三角形");
    }
}
