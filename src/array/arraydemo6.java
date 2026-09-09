package array;

public class arraydemo6 {
    public static void main(String[] args) {
        int[] arr = {13, 24, 35, 46, 57, 46};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max >= arr[i]) max =max;
            else max = arr[i];
        }
        System.out.println(max);
        }

    }

