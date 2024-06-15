import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adını Giriniz");
        String username = scanner.nextLine();

        System.out.println("Şİfreyi Giriniz");
        String password = scanner.nextLine();

        if(username.equals("Patika") && password.equals("java123")){
            System.out.println("Giriş işlemi başarılı");
        }
        else{
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }

    }
}
