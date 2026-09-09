package test;

public class test3 {
    public static void main(String[] args) {
        int[] arr1 = {11, 2, 7, 11, 6,};
        int[] arr2 = {1, 2, 3, 9, 5, 6};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        for (int j = 0; j < arr3.length; j++) {
            for (int i = 0; i < arr3.length - 1; i++) {
                if(arr3[i] > arr3[i + 1]){
                    int temp = arr3[i];
                    arr3[i] = arr3[i + 1];
                    arr3[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        int slow = 0;
        int fast = 1;
        while (fast < arr3.length) {
            if (arr3[slow] != arr3[fast]) {
                slow++;
                arr3[slow] = arr3[fast];
            }
            fast++;
        }
        System.out.println(slow);
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        double median = (arr3[slow / 2] + arr3[slow / 2 + 1]) / 2.0;
        if((slow + 1) % 2 == 0) System.out.println(median);
        else System.out.println(arr3[slow / 2]);
    }
}
