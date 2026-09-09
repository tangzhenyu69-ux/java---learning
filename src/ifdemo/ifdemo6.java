package ifdemo;

import java.util.Scanner;

/*
10 - 8
50 -30
100 - 50
200 - 90
打八折
*/
public class ifdemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        if (price <= 0) {
            System.out.println("价格不合理");
            return;
        }
        System.out.println("价格合理");
        double a;
        if (price >= 200) a = price - 90;
        else if (price >= 100) a = price - 50;
        else if (price >= 50) a = price - 30;
        else if (price >= 10) a = price - 8;
        else a = price;
        System.out.println("优惠后价格为：" + a);
        double c = price * 0.8;
        System.out.println("打八折后价格为：" + c);
        if (a >= c ) System.out.println("打八折更便宜");
        else System.out.println("使用满减优惠");

    }
}
