package array;

public class arraydemo12 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 5, 7, 9};
        int[] arr2 = {10, 6, 4, 8, 2, 5};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length)
                arr3[i] = arr1[i];
            else
                arr3[i] = arr2[i - arr1.length];
        }
        int slow = 0;
        int fast = 1;
        for (int i = 1; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length - 1; j++) {
                if (arr3[j] > arr3[j + 1]){
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        while (fast < arr3.length) {
            if (arr3[slow] != arr3[fast]) {
                slow++;
                arr3[slow] = arr3[fast];
            }
            fast++;}
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
