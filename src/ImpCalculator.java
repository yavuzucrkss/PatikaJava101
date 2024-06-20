import java.util.Scanner;

public class ImpCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi \n" +
                "2- Çıkarma İşlemi \n" +
                "3- Çarpma İşlemi \n" +
                "4- Bölme İşlemi \n"  +
                "5- Üslü sayı hesaplama \n" +
                "6- Mod alma \n" +
                "7- Diktörtken Alan ve Çevresi Hesaplama \n" +
                "8- Çıkış yap";


        int a, b;
        do {
            System.out.println(menu);
            select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.println("2 sayı giriniz");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    sum(a, b);
                    break;
                case 2:
                    System.out.println("2 sayı giriniz");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    sub(a, b);
                    break;
                case 3:
                    System.out.println("2 sayı giriniz");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    multipy(a, b);
                    break;
                case 4:
                    System.out.println("2 sayı giriniz");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    divide(a, b);
                    break;
                case 5:
                    System.out.println("2 sayı giriniz");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    pow(a, b);
                    break;
                case 6:
                    System.out.println("2 sayı giriniz");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    mod(a, b);
                    break;
                case 7:
                    System.out.println("Diktörtgenin kenarlarını giriniz: ");
                    a = scanner.nextInt();
                    b= scanner.nextInt();
                    rectangleArea(a, b);
                    break;
                case 8:
                    System.out.println("Çıkış yapılıyor");
                    break;
            }
        }while (select != 8);
    }

    static void sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam" + a + " + " + b + " = " + result);
    }

    static void sub(int a, int b){
        int result = a - b;
        System.out.println("Toplam" + a + " - " + b + " = " + result);
    }

    static void multipy(int a, int b){
        int result = a * b;
        System.out.println("Toplam" + a + " * " + b + " = " + result);
    }

    static void divide(int a, int b){
        int result = a / b;
        System.out.println("Toplam" + a + " / " + b + " = " + result);
    }

    static void pow(int a, int b){
        while(b != 0){
            a *= a;
            b--;
        }
        System.out.println("Üslü işlemin sonucu: " + a);
    }

    static void mod(int a, int b){
        int result = a % b;
        System.out.println("Mod" + a + "'nın " + b + "'si = " + result);
    }

    static void rectangleArea(int a, int b){
        System.out.println("Diktörtgenin çevresi: " + 2*(a+b));
        System.out.println("Diktörtgenin alanı: " + a*b);
    }
}
