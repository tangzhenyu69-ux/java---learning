package ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    /*public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        System.out.println("请输入两个整数：");
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int c = 200;
        if (c-a <= 1){
            System.out.println("游戏结束");
        }
        if (c-a > 1 && c-a+b >= 200){
            System.out.println("血量为200");
        }
        if (c-a > 1 && c-a+b < 200){
            System.out.println("血量为"+(c-a+b));
        }
    }*/
    public static void main(String[] args) {
        int hp = 200;
        Scanner sc1 = new Scanner (System.in);
        System.out.println("请输入攻击值：");
        int attack = sc1.nextInt();
        if (hp - attack <= 0){
            System.out.println("游戏结束");
        } else {
            System.out.println("剩余血量为" + (hp - attack));
            System.out.println("请输入恢复的血量");
            int recover = sc1.nextInt();
            if (hp - attack + recover >= 200){
                System.out.println("血量为200");
            } else {
                System.out.println("血量为" + (hp - attack + recover));
            }
        }


    }
}
