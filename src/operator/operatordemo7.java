package operator;

import java.util.Scanner;

public class operatordemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int a = num % 3;
        boolean result = a == 0;
        System.out.println(result);
    }
}
