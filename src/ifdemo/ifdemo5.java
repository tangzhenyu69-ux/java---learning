package ifdemo;

import java.util.Scanner;
/*方式一：满30减10
方式二：打九折*/

public class ifdemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        int a = (int) (price / 30);
        System.out.println(price - a * 10);
        System.out.println(price * 0.9);
        if (price > 0) {
            System.out.println("价格合理");
         if (price * 0.9 >= price - a * 10)  {
             System.out.println("选择方式一");
         } else {
             System.out.println("选择方式二");
         }
        } else {
            System.out.println("价格不合理");

        }
    }
}
