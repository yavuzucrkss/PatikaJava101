import java.util.Scanner;

public class BodyIndexCalculator {
    public static void main(String[] args) {
        double kg, length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        length = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kg = scanner.nextDouble();

       double index = kg / length * length;

        System.out.println( "Vücut Kitle İndeksiniz :" + index);
    }
}
