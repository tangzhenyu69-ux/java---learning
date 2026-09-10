package array;

import java.util.Scanner;

public class arraydemo13 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            } else if (target > arr[i] && target < arr[i + 1])
                System.out.println(i + 1);
        }
    }
}
