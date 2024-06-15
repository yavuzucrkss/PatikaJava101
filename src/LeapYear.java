import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl giriniz: ");
        int year = scanner.nextInt();

        if(year % 400 == 0){
            System.out.println("Artık yıl!");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Artık yıl!");
        }
        else{
            System.out.println("Artık yıl değil!");
        }
    }
}
