import java.util.Scanner;

public class OddNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, sum = 0;
        do {
            System.out.println("Sayı Giriniz: ");
            k = scanner.nextInt();
            sum += k % 4 == 0 ? k : 0;
        }while(k % 2 == 1);

        System.out.println("Toplam: " + sum);
    }
}
