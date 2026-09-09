package method;

public class methoddemo5 {
    public static void main(String[] args) {
        double length1 = 10.5;
        double width1 = 5.2;
        double length2 = 7.8;
        double width2 = 3.4;
        double area1 = getarea(length1,width1);
        double area2 = getarea(length2,width2);
        System.out.println("Area 1: " + area1);
        System.out.println("Area 2: " + area2);
    }
    public static double getarea(double length,double width){
        return length * width;
    }
}
