package test;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 2, 4, 6, 8, 8, 9, 10};
        int val = 8;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                System.out.print(arr[i]);
                count++;
            }
        }
       /* int slow = 0;
        int fast = 0;
        for (; fast < arr.length; ) {
            if (arr[fast] != val) {
                arr[slow] = arr[fast];
                slow++;
                count++;
            }
            fast++;
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }*/
        System.out.println("剩余元素个数为：" + count);
    }
}
