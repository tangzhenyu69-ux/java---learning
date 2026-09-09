package method;

public class methoddemo4 {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
