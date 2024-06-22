import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        while(right < 5){
            System.out.println("Lütfen tahmin edilen sayıyı giriniz: ");
            selected = scanner.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Değer aralığı 0 ile 100 arasındadır...");
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler doğru tahmin!! Tahmin edilen sayı: " + number);
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz..");
                wrong[right] = selected;
                if(selected > number)
                    System.out.println("Seçtiğiniz sayı aranan sayıdan daha büyük");
                else
                    System.out.println("Seçtiğiniz sayı aranan sayıdan daha küçük");
                right++;
                System.out.println("Kalan hak: " + (5 - right));
            }

        }

        if(!isWin){
            System.out.println("Kaybettiniz :(");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}
