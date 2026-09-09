package operator;

import java.util.Scanner;

public class operatordemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int Seconds = seconds % 60;
        System.out.println(hours + "小时" + minutes + "分钟" + Seconds + "秒");
    }
}
