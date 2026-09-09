package controllerloop;

import java.util.Scanner;

public class breakdemo2 {/*public static void main(String[] args) {
    int hp = 200;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("请输入攻击值：");
    int attack = sc1.nextInt();
    while (attack < 0) {
        System.out.println("请重新输入攻击值");
        attack = sc1.nextInt();
        if (attack > 0) break;
    }
    if (hp - attack <= 0) {
        System.out.println("游戏结束");
    } else {
        System.out.println("剩余血量为" + (hp - attack));
        System.out.println("请输入恢复的血量");
        int recover = sc1.nextInt();
        while (recover < 0) {
            System.out.println("请重新输入恢复的血量");
            recover = sc1.nextInt();
            if (recover > 0) break;
        }
        if (hp - attack + recover >= 200) {
            System.out.println("血量为200");
        } else {
            System.out.println("血量为" + (hp - attack + recover));
        }
    }
}*/

    public static void main(String[] args) {
        int hp = 200;
        int attack = 0;
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("请输入攻击值：");
            attack = sc1.nextInt();
            if (attack >= 0) break;
        }
        if (hp - attack <= 0) {
            System.out.println("游戏结束");
        } else {
            System.out.println("剩余血量为" + (hp - attack));
            System.out.println("请输入恢复的血量");
            int recover = sc1.nextInt();
            if (hp - attack + recover >= 200) {
                System.out.println("血量为200");
            } else {
                System.out.println("血量为" + (hp - attack + recover));
            }
        }

    }
}
