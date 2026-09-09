package loopfor;

public class fordemo3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 5; a++) {
           sum = a + sum;
        }
        System.out.println(sum);
    }
}
