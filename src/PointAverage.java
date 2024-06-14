import java.util.Scanner;

public class PointAverage {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkce Notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = inp.nextInt();


        int sum = (mat + fizik + kimya + turkce + tarih);

        double result = sum / 5.0;
        System.out.println("Ortalma = " + result);

        System.out.println(result > 60 ? "Sınıfı geçti" : "Sınıfta Kaldı");
    }
}
