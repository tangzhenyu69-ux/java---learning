package ifdemo;

import java.util.Scanner;

public class ifdemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("请输入考试成绩：");
        double score = sc.nextDouble();
        if (score > 0 && score <= 100){
            System.out.println("合理");
            if (score >= 60){
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        } else {
            System.out.println("不合理");
        }
    }
}
