package switchdemo;

import java.util.Scanner;

public class switchdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("学习");
                break;
            case 4:
                System.out.println("写代码");
                break;
            case 5:
                System.out.println("看电影");
                break;
            case 6:
                System.out.println("吃饭");
                break;
            case 7:
                System.out.println("休息");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
