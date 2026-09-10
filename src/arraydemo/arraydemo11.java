package array;

public class arraydemo11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
           num = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
