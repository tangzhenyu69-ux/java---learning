package array;

import java.util.Random;

public class arraydemo9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        i = i - 1;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
