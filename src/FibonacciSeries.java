import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç elemanlı fibonacci serisi oluşsun ?");
        int num = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 2; i <= num; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");

        }
    }
}
