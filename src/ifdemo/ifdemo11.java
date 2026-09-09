package ifdemo;

import java.util.Scanner;

public class ifdemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x > 0 && y > 0) System.out.println("第一象限");
        else if (x < 0 && y > 0) System.out.println("第二象限");
        else if (x < 0 && y < 0) System.out.println("第三象限");
        else if (x > 0 && y < 0) System.out.println("第四象限");
        else if (x == 0 && y != 0) System.out.println("y轴");
        else if (x != 0 && y == 0) System.out.println("x轴");
        else System.out.println("原点");

    }
}
