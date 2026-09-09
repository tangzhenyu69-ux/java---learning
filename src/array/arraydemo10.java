package array;

public class arraydemo10 {
    public static void main(String[] args) {
        int slow = 0;
        int fast = 1;
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 34, 5};
        while (fast < arr.length) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

