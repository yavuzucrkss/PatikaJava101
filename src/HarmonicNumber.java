import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        double harSum = 0;
        for(int i = 1; i <= n; i++){
            harSum +=  (double) 1 / i;
        }

        System.out.println(harSum);
    }
}
