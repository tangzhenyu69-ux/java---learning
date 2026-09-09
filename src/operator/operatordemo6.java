package operator;

import java.util.Scanner;

public class operatordemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        double height1 = sc.nextDouble();
        System.out.println("请输入他的身高：");
        double height2 = sc.nextDouble();
        boolean result = height1 >= height2;
        System.out.println(result);
    }
}
