package operator;

import java.util.Scanner;

public class operatordemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        boolean result = a >= 1 & a <= 10;
        System.out.println(result);
    }
}
