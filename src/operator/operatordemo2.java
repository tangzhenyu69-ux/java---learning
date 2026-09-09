package operator;

import java.util.Scanner;

public class operatordemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int a = num % 10;
        System.out.println("个位数为" + a);
        int b = (num - a) / 10 % 10;
        System.out.println("十位数为" + b);
        int c = num / 100;
        System.out.println("百位数为" + c);

    }
}
