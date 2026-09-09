package looploop;

public class test6 {
    public static void main(String[] args) {
        int halfHeight = 3;

        for (int row = 1; row <= halfHeight; row++) {
            printRow(halfHeight, row);
        }
        for (int row = halfHeight - 1; row >= 1; row--) {
            printRow(halfHeight, row);
        }
    }

    private static void printRow(int halfHeight, int row) {
        for (int space = 1; space <= halfHeight - row; space++) {
            System.out.print(" ");
        }

        System.out.print("*");
        if (row > 1) {
            for (int space = 1; space <= 2 * row - 3; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
    }
}
