package ifdemo;

import java.util.Scanner;

public class ifdemo8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        System.out.println("请输入身高和体重");
        double height = sc1.nextDouble();
        double weight = sc2.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI指数为：" + bmi);
        if (bmi < 18.5) System.out.println("消瘦");
        else if (bmi < 23.9) System.out.println("正常");
        else if (bmi < 29.9) System.out.println("肥胖");
        else System.out.println("严重肥胖");

    }
}
