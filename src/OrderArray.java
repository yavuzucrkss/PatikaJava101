import java.util.Arrays;
import java.util.Scanner;

public class OrderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu seciniz");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ". Elemanı giriniz:");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
