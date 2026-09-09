package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);
        System.out.println(n);
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int i = 0;
        while (true) {
            System.out.println("请输入一个数");
            a = sc.nextInt();
            if (a > n) {
                System.out.println("太大了");
            } else if (a < n) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;}
            i++;
            if (i == 3) System.out.println("范围为" + (n - 3) + "到" + (n + 3));
            if (i == 10) {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
