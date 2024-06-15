import java.util.Scanner;

public class WeatherActivities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sıcaklık değeri giriniz: ");
        int weather = scanner.nextInt();

        if(weather < 5){
            System.out.println("Kayak");
        }
        else if(weather <= 25){
            if(weather <= 15){
                System.out.println("Sinema");
            }
            if(10 <= weather){
                System.out.println("Piknik");
            }
        }else{
            System.out.println("Yüzme");
        }
    }
}
