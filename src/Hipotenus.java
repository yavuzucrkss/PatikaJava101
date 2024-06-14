import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.println("a kenarının uzunluğunu giriniz:");
        a = inp.nextInt();
        System.out.println("a kenarının uzunluğunu giriniz:");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        double totalLength = a + b + c;
        double totalArea = (totalLength/2)*((totalLength/2) - a)*((totalLength/2)-b)*((totalLength/2)-c);
        System.out.println("Toplam Uzunluk: " + totalLength);
        System.out.println("Toplam Alan: " + totalArea);
    }
}
