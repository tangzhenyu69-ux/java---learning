package ifdemo;

import java.util.Scanner;

public class ifdemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入充值数目：");
        double recharge = sc.nextDouble();
        if (recharge > 0) {
            System.out.println("充值成功");
            if (recharge < 1000) recharge = recharge;
            else if (recharge < 2000) recharge = recharge + 200;
            else if (recharge < 3000) recharge = recharge + 500;
            else if (recharge < 5000) recharge = recharge + 700;
            else if (recharge < 10000) recharge = recharge + 1300;
            else if (recharge < 20000) recharge = recharge + 2500;
            else if (recharge < 50000) recharge = recharge + 6000;
            else  recharge = recharge + 15000;
        } else System.out.println("充值失败");
        System.out.println("充值金额为：" + recharge);
    }
}
