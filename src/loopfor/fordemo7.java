package loopfor;

import java.util.Scanner;

public class fordemo7 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数列的项数");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++){
            if (i % 2 == 1) result += i;
            else result -= i;
        }
        System.out.println(result);
    }
}
