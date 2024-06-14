import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a , b;
        System.out.println("İlk sayıyı giriniz:  ");
        a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        b = scanner.nextInt();

        System.out.println("Operasyonu seçiniz:\n 1-Toplama \n2-Çıkartma \n 3-Çarpma \n 4-Bölme");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplama: "+ a + " + " + b + " = " + (a + b) );
                break;
            case 2:
                System.out.println("Çıkarma: "+ a + " - " + b + " = " + (a - b) );
                break;
            case 3:
                System.out.println("Çarpma: "+ a + " * " + b + " = " + (a * b));
                break;
            case 4:
                if(b == 0){
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                else{
                    System.out.println("Bölme: "+ a + " / " + b + " = " + (a / b) );
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız!!");
                break;
        }


    }
}
