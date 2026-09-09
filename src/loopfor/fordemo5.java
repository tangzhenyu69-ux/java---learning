package loopfor;

import java.util.Scanner;

public class fordemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入定义域");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if (a <= b) {
            for (int i = a; i >= a && i <= b; i++)
                if (i % 15 == 0) sum++;
        } else {
            for (int i = b; i >= b && i <= a; i++)
                if (i % 15 == 0) sum++;
        }
        System.out.println(sum);
        if (sum == 0) System.out.println("在"+a+"到"+b+"之间没有15的倍数");
    }
}
