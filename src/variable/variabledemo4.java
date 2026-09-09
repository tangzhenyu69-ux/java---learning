package variable;

import java.util.Scanner;

public class variabledemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入另一个整数：");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("和为"+sum);
    }
}
