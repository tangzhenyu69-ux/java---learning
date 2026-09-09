package method;

import java.util.Scanner;

public class methoddemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        while (true) {
            System.out.println("请输入重量：");
            weight = sc.nextDouble();
            if (weight < 0) System.out.println("输入错误");
            else break;
        }
        if (weight <= 1) price1(weight);
        else if (weight <= 5) price2(weight);
        else price3(weight);
    }
    public static void price1(double weight) {
        System.out.println("价格为：10元" );
    }
    public static void price2(double weight) {
        double price = (weight - 1)*2 + 10;
        System.out.println("价格为：" + price);
    }
    public static void price3(double weight) {
        double price = (weight - 5)*1.5 + 18;
        System.out.println("价格为：" + price);
    }
}