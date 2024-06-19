import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        int right = 3;
        int balance = 1500;
        int selected;

        while(right > 0){
            System.out.println("Kullanıcı Adınız:");
            username = scanner.nextLine();
            System.out.println("Şifreniz: ");
            password = scanner.nextLine();
            if(username.equals("Patika") && password.equals("dev123")) {
                System.out.println("Sisteme Giriş Yaptınız");
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap \n" +
                            "Lütfen yapmak istediğiniz işlemi seçiniz:" );
                    selected = scanner.nextInt();
                    int price;
                    switch (selected){
                        case 1:
                            System.out.println("Ne kadar para yatırmak istiyorsunuz?");
                            price = scanner.nextInt();
                            balance += price;
                            System.out.println("Para yatırma işleminiz başarılı, bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Ne kadar para çekmek istiyorsunuz ?");
                            price =scanner.nextInt();
                            if(balance < price)
                                System.out.println("Bakiyeniz yetersiz!");
                            else{
                                balance -= price;
                                System.out.println("Para çekilmiştir, Bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("GÜncel bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor..");
                            break;
                    }
                }while(selected != 4);
                break;

            }
            else {
                --right;
                if (right <= 0){
                    System.out.println("Hesap bloke olmuştur, bankanızla iletişime geçiniz.");
                }
                else{
                    System.out.println("Hatalı şifre, Tekrar deneyiniz");
                    System.out.println("Kalan hakkınız: " + right);
                }

            }
        }
    }
}
