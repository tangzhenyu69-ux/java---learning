package array;

import java.util.Scanner;

public class arraydemo5 {
    public static void main(String[] args) {
        int[] arr = {20, 5, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                flag = true;
                System.out.println(i);
                break;
            }
            /*if (i == arr.length - 1) {
                System.out.println("不存在该数据");
            }*/
        }
        if(!flag)
            System.out.println("不存在该数据");
    }
}
