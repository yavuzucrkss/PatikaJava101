import java.util.Scanner;

public class ExponentialNumCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("Üssü giriniz:");
        int k = scanner.nextInt();

        int expSum = 1;
        for(int i = 0; i < k; i++){
            expSum *= n;
        }

        System.out.println("Sonuç: " + expSum);

    }
}
