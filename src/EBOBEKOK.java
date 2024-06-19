import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2 sayı giriniz");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int ebob = Ebob(n1, n2);
        int ekok = Ekok(n1, n2);
        System.out.println(ebob);
        System.out.println(ekok);
    }

    public static int Ebob(int n1, int n2){
        int counter;
        int ebob = 1;
        if(n2 >= n1){
            counter = n1;
            while (counter >= 1){
                if( n1 % counter == 0 && n2 % counter == 0){
                    ebob = counter;
                    break;
                }
                counter--;
            }
        }else{
            counter = n2;
            while (counter >= 1){
                if(n1 % counter == 0 && n2 % counter  == 0){
                    ebob = counter;
                    break;
                }
                counter--;
            }
        }
        return ebob;
    }

    public static int Ekok(int n1, int n2){
        int ekok = 1;
        int counter = 1;

        while(counter <= n1*n2){
            if(counter % n1 == 0 &  counter % n2 == 0){
                ekok = counter;
                break;
            }
            counter++;
        }

        return ekok;
    }
}
