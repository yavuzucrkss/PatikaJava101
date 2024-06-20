import java.util.Scanner;

public class RecursivePow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban Sayıyı giriniz");
        int a = scanner.nextInt();

        System.out.println("Üslü sayıyı giriniz:");
        int b = scanner.nextInt();

        System.out.println(recursivePow(a,b));
    }

    private static int recursivePow(int a, int b) {
        if(b == 0){
            return 1;
        }
        else{
            return a * recursivePow(a,b-1);
        }
    }
}
