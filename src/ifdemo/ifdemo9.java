package ifdemo;

import java.util.Scanner;

public class ifdemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int usage = sc.nextInt();
        double cost = 0;
        if (usage > 0) {
            System.out.println("输入正确");
            if (usage <= 100) cost = usage * 0.5;
            else if (usage <= 200) cost = (usage - 100) * 0.8 + 50;
            else cost = (usage - 200) * 1.2 + 130;
        } else System.out.println("输入错误");
        System.out.println("电费为：" + cost);
    }
}
