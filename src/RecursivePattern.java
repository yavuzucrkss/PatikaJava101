import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        recursive(num);
    }

    private static void recursive(int num) {
        if(num <= 0){
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        recursive(num-5);
        System.out.print(num + " ");
    }
}
