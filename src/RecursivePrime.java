import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int num = scanner.nextInt();

        // Printing result
        boolean isPrimeResult = isPrime(num,2);
        if(isPrimeResult){
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is not a prime number.");
        }
    }

    static boolean isPrime(int number,int divisor){
        if(divisor == number){
            return true;
        }
        if(number % divisor == 0){
            return false;
        }
        return isPrime(number,divisor+1);
    }
}
