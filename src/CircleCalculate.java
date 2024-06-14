import java.util.Scanner;

public class CircleCalculate {
    public static void main(String[] args) {
        double pi = 3.14;
        int r;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarı çapini giriniz : ");
        r = scanner.nextInt();

        double area = r*r*pi;
        double perimeter = 2*pi*r;

        System.out.println("Dairenin alanı :" + area);
        System.out.println("Dairenin cevresi : " + perimeter);

        System.out.println("Daire diliminin açısını giriniz: " );
        int circleDegree = scanner.nextInt();

        area = (pi * r*r*circleDegree) / 360;

        System.out.println("Daire diliminin alanı :" + area);
    }
}
