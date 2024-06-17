import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı seçin: ");
        int num = scanner.nextInt();
        System.out.println("Kombinasyonunu seçin: ");
        int comb = scanner.nextInt();

        int combination = Factoriel(num) / Factoriel(comb) * Factoriel(num -comb);

        System.out.println(combination);
    }

    public static int Factoriel(int n){
        int fact = 1;
        for(int i = 1; i <=n ; i++){
            fact *=i;
        }
        return fact;
    }
}
