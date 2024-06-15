import java.sql.SQLOutput;
import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Gününü Giriniz: ");
        int day = scanner.nextInt();

        System.out.println("Doğum Ayını Gİriniz: ");
        int month = scanner.nextInt();

        if(month == 1){
            if(day < 22)
                System.out.println("Oğlak Burcu");
            else
                System.out.println("Kova Burcu");
        }
        else if(month == 2){
            //Devamı angarya
        }
        else if(month == 3){

        }
        else if(month == 4){

        }else if(month == 5){

        }
        else if(month == 6){

        }
        else if(month == 7){

        }
        else if(month == 8){

        }
        else if(month == 9){

        }
        else if(month == 10){

        }
        else if(month == 11){

        }
        else if(month == 12){

        }

    }
}
