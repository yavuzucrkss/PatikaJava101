import java.util.Scanner;

public class GrocerCalculator {

    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;

        double kg;

        Scanner scanner = new Scanner(System.in);

        double totalAmount = 0;

        System.out.println("Armut Kaç Kilo ?");
        kg = scanner.nextDouble();
        totalAmount += kg*armut;

        System.out.println("elma Kaç Kilo ?");
        kg = scanner.nextDouble();
        totalAmount += kg*elma;

        System.out.println("domates Kaç Kilo ?");
        kg = scanner.nextDouble();
        totalAmount += kg*domates;

        System.out.println("muz Kaç Kilo ?");
        kg = scanner.nextDouble();
        totalAmount += kg*muz;

        System.out.println("patlican Kaç Kilo ?");
        kg = scanner.nextDouble();
        totalAmount += kg*patlican;

        System.out.println("Toplam TUtar: " + totalAmount);
    }
}
