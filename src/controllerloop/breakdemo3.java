package controllerloop;

import java.util.Scanner;

public class breakdemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int b = 0;
        while (true) {
            System.out.println("请输入一个正整数：");
            num = sc.nextInt();
            if (num > 2) break;
        }
        for (int i = 1;i <= num ; i++) {
            if (num % i == 0) b++;
            if (b >= 3) {
                System.out.println("输入的不是质数");
                break;
            }
        }
        if (b < 3)  System.out.println("输入的是质数");
    }
}