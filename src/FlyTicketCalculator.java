import java.util.Scanner;

public class FlyTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Gİdilecek mesafeyi giriniz: ");
        int distance = scanner.nextInt();

        System.out.println("Yolculuk tipini seciniz \n 1: Gidiş \n 2: Gidiş-Dönüş");
        int type = scanner.nextInt();

        double netAmount = distance * 0.1;
        double amount = netAmount;
        if(type == 2){
            amount = netAmount * 0.8;
        }
        if(age < 12)
            amount /= 2;
        else if(age <= 24)
            amount *= 0.9;
        else if(age >= 65)
            amount *= 0.8;

        System.out.println("Tutar: " + amount);
    }
}
