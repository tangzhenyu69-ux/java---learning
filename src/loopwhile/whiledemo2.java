package loopwhile;

public class whiledemo2 {
    public static void main(String[] args) {
        double a = 100000;
        int b = 0;
        while (a < 200000){
            a =  a * 1.017;
            b++;
        }
        System.out.println(b);
    }
}
