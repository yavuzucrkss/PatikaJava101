import java.util.Scanner;

public class NumverOrderer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3 adet sayi giriniz");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a < b && a < c){
            System.out.print(a + "->");
            if(b < c){
                System.out.print(b + "->");
                System.out.print(c);
            }
            else{
                System.out.print(c + "->");
                System.out.print(b);
            }
        }
        else if (b < a && b < c){
            System.out.print(b+ "->");
            if(a < c){
                System.out.print(a + "->");
                System.out.print(c);
            }
            else{
                System.out.print(c + "->");
                System.out.print(a);
            }
        }else{
            System.out.print(c+ "->");
            if(b < a){
                System.out.print(b + "->");
                System.out.print(a);
            }
            else{
                System.out.print(a + "->");
                System.out.print(b);
            }
        }


    }
}
