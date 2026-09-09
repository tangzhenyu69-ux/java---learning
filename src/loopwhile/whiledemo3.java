package loopwhile;

public class whiledemo3 {
    public static void main(String[] args) {
        double a = 0.0001;
        int b = 0;
        int c = 8848;
        while (a <= c){
            a = a * 2;
            b++;
        }
        System.out.println(b);
    }
}
