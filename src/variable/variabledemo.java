package variable;

public class variabledemo {
/*    微信余额：100
    支付宝余额：30
    1·计算总余额
    2·微信收入10元后又发出50元红包此时还剩多少钱*/
public static void main(String[] args) {
    int wechatBalance = 100;
    int alipayBalance = 30;
    System.out.println("总余额为：" + (wechatBalance + alipayBalance));
    wechatBalance = wechatBalance + 10 - 50;
    System.out.println("微信余额为：" + wechatBalance);
}
}
