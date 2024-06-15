import java.util.Scanner;

public class SinifGEcme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notunu Gİriniz :");
        mat = scanner.nextInt();

        System.out.println("fizik Notunu Gİriniz :");
        fizik = scanner.nextInt();

        System.out.println("turkce Notunu Gİriniz :");
        turkce = scanner.nextInt();

        System.out.println("kimya Notunu Gİriniz :");
        kimya = scanner.nextInt();

        System.out.println("muzik Notunu Gİriniz :");
        muzik = scanner.nextInt();

        int total = 0;
        int counter = 0;
        if(0 <mat && mat < 100){
            total += mat;
            counter++;
        }
        if(0 <fizik && fizik < 100){
            total += fizik;
            counter++;
        }
        if(0 <turkce && turkce < 100){
            total += turkce;
            counter++;
        }
        if(0 <kimya && kimya < 100){
            total += kimya;
            counter++;
        }
        if(0 <muzik && muzik < 100){
            total += muzik;
            counter++;
        }


        double average = (double) (total) / counter;

        if(average <= 55){
            System.out.println("Sınıfta kaldınız. Notunuz:" + average);
        }
        else{
            System.out.println("Sınıfı geçtiniz. Notunuz: " + average);
        }

    }
}
