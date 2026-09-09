package looploop;

import java.text.Format;

public class test3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int p = 3; p > i; p--){
                System.out.print(" ");
            }
            for ( int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
