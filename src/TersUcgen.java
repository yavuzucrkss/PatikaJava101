import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz: ");
        int num = scanner.nextInt();

        for(int i = num; i > 0; i--){
            for(int j = 0; j < 2*i -1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
