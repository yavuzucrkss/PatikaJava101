import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        double perKm = 2.2;

        Scanner inp = new Scanner(System.in);

        System.out.println("Gidilen Km: ");
        double km = inp.nextDouble();

        double amount = (km * perKm + 10) > 20 ? (km * perKm + 10) : 20;

        System.out.println("Toplam Ücret: " + amount);
    }
}
