import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArrays {
    public static void main(String[] args) {
        int[] arr = {43,13,776,34,2,67,98,15};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int selected = scanner.nextInt();

        int upperMin = Integer.MAX_VALUE;
        int lowerMax = Integer.MIN_VALUE;

        for(int n : arr){
            if(n > selected){
                if(upperMin > n)
                    upperMin = n;
            }
            if(n < selected){
                if(lowerMax < n){
                    lowerMax = n;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(upperMin + " " + lowerMax);
    }
}
