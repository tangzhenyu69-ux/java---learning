package switchdemo;

import java.util.Scanner;

public class switchdemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3,4,5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9,10,11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入错误");
        }

    }
}
