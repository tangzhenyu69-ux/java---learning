package loopfor;

public class fordemo4 {
 /*   public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) sum = sum + a;
        }
        System.out.println(sum);
    }*/
 public static void main(String[] args) {
     int sum = 0;
     for (int a = 2; a <= 100; a += 2) {
        sum = sum + a;
     }
     System.out.println(sum);
 }
}
