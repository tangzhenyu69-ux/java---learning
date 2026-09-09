package controllerloop;

import java.util.Scanner;

public class continuedemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("请输入一个整数");
            num = sc.nextInt();
            if (num > 0 && num <= 100000) break;
        }
        for (int i = 1; i <= num; i++) {
            if (
                    i % 10 == 4 || i / 10 % 10 == 4 || i / 100 % 10 == 4 || i / 1000 % 10 == 4 || i / 10000 == 4|| i % 4 == 0
            ) continue;
            System.out.println(i);
        }
    }
}