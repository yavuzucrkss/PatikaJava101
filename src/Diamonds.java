import java.util.Scanner;

public class Diamonds {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = n / 2; i >= -n / 2; i--) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= n-2*i-1 && i >= 0; k++){
                System.out.print("*");
            }
            for(int y = 0; y < -i; y++){
                System.out.print(" ");
            }
            for(int x = 0; x <= n + 2*i-1 && i < 0; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
