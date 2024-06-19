import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num)
            System.out.println("Bu bir mükemmel sayıdır.");
        else
            System.out.println("Bu bir mükemmel sayı değildir.");
    }
}
