package operator;

import java.util.Scanner;

public class operatordemo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        int b = a / 10;
        int c = a % 10;
        boolean result = b == 7 || c == 7 || a % 7 == 0;
        System.out.println(result);
    }
}
