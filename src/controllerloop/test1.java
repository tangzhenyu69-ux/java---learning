package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true){
            System.out.println("请输入一个数");
            a = sc.nextInt();
            if (a > n){
                System.out.println("太大了");
            }else if (a < n){
                System.out.println("太小了");
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
