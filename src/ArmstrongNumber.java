import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int tmp = num;
        int counter = 1;

        while (tmp > 10){
            tmp /= 10;
            counter++;
        }
        int sum = 0;
        for(int i = 0; i < counter; i++){
            int div = (int) Math.pow(10,i);
            sum += (int) Math.pow((num / div) % 10,counter);
        }
        System.out.println(sum);
        if(sum == num)
            System.out.println("Seçilen sayi bir armstrong sayısıdır.");
        else
            System.out.println("Seçilen sayı bir armstrong sayısı değildir.");
    }
}
