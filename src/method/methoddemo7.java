package method;

import java.util.Scanner;

public class methoddemo7 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个整数");
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 100) {
                System.out.println("输入错误");
                i--;
            }
        }
        System.out.println("及格人数为" + pass(arr));
        int passrate = pass(arr) * 100 / arr.length;
        System.out.println("及格率为" + passrate + "%");
        System.out.println("总分为：" + sum(arr));
        double average =  sum(arr) / arr.length;
        System.out.println("平均分为：" + average);
        System.out.println("最大值为：" + max(arr));
    }
    public static int pass(double[] arr) {
        int  count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }
    public static double sum(double[]arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int max(double[] arr) {
        double temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
            {   temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;}

        }
        return (int) arr[arr.length - 1];
    }
}
