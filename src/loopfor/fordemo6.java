package loopfor;

public class fordemo6 {
    public static void main(String[] args) {
        int result = 0;
        int b = 0;
        int c = 1;
        for (int a = 1; a <= 8; a++){
            result = b + c;
            b = c;
            c = result;
        }
        System.out.println(result);
    }


}
