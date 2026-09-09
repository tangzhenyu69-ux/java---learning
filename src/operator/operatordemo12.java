package operator;

import java.util.Scanner;

public class operatordemo12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        System.out.println("请输入两个整数：");
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int max = a > b ? a : b;
        System.out.println("max = " + max);
    }
}
