package method;

import java.util.Scanner;

public class methoddemo6 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个整数");
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 100) {
                System.out.println("输入错误");
                i--;
            }
        }
//        计算最大值和最小值
        System.out.println("最大值为：" + max(arr));
        print(arr);
        System.out.println("最小值为：" + min(arr));
        print(arr);
//        计算总分
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
//           计算平均值
        double average = (sum - max(arr) - min(arr)) / (arr.length - 2);
        System.out.println("平均值为："+ average);
    }


    public static int max(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
            {   temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;}

        }
        return arr[arr.length - 1];
    }
    public static int min(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
            {   temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;}
        }
        return arr[arr.length - 1];
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
