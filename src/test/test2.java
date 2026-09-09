package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int m = 10000;
        int n = 50;
        int[] arr = new int[n];
        Random r = new Random();
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = r.nextInt(200) + 1;
            }
            if (sum(arr) == m) break;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int sum ( int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
