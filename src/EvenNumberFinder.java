import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Sayı giriniz :");
        int k = scanner.nextInt();

        while(k >= 0){
            if(k % 3 == 0 || k % 4 == 0)
                System.out.print(" " + k + " ");
            k--;
        }
    }
}
