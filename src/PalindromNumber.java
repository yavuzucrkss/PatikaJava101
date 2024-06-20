import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int num = scanner.nextInt();

        if(isPalindrom(num))
            System.out.println("Palindrom sayı!");
        else
            System.out.println("Palindrom sayı değil!");
    }

    static boolean isPalindrom(int number){
        int temp = number;
        int lastNumber;
        int reverseNumber = 0;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /= 10;
        }
        return number == reverseNumber;
    }
}
