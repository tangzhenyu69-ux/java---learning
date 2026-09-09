package variable;

import java.util.Scanner;

public class variabledemo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = scanner.nextDouble();
        System.out.println("请输入身高：");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI指数为：" + bmi);    // 输出BMI指数
    }
}
