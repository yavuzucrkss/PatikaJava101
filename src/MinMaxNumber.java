import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int num;
        System.out.println("Kaç sayı gireceksiniz?");
        counter = scanner.nextInt();

        for(int i = 1; i <= counter; i++){
            System.out.println(i + ". sayıyı giriniz: ");
            num = scanner.nextInt();
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }

        System.out.println("Min: " + min + " Max: " + max);

    }
}
