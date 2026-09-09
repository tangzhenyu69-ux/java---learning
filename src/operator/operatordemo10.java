package operator;

import java.util.Scanner;

public class operatordemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int a = scanner.nextInt();
        int b = a / 1000;
        int c = a / 100 % 10;
        int d = a / 10 % 10;
        int e = a % 10;
        boolean result = b == e && c == d;
        System.out.println(result);
    }
}
