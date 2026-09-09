package switchdemo;

import java.util.Scanner;

public class switchdemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要计算的数字和计算符号");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operator = sc.next();
        double result = switch (operator){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println(result);
    }
}
