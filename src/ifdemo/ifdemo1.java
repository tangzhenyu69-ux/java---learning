package ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体温");
        double tem = sc.nextDouble();
        if (tem >= 38.0){
            System.out.println("体温过高");
        }
        else {
            System.out.println("体温正常");
        }
    }
}
