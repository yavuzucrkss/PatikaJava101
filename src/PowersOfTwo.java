import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int k = scanner.nextInt();
        int counter = 1;

        while(k>counter){
            System.out.println(" " + counter + " ");
            counter*=4;
        }
        counter = 1;
        while(k>counter){
            System.out.println(" " + counter + " ");
            counter*=5;
        }

    }
}

