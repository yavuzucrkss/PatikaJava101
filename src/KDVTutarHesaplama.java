import java.util.Scanner;

public class KDVTutarHesaplama {
    public static void main(String[] args) {
        double amount;

        Scanner inp = new Scanner(System.in);

        System.out.println("Para tutarını giriniz: ");
        amount = inp.nextInt();

        double kdv = amount <= 1000 ? 0.18 : 0.08;

        double kdvAmount = amount*kdv;
        double totalAmount = amount + kdvAmount;

        System.out.println("Toplam TUtar :" + totalAmount);
        System.out.println("KDV Tutarı:" + kdvAmount);
        System.out.println("KDV Oranı:" + kdv);
    }
}
