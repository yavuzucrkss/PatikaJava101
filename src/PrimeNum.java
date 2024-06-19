public class PrimeNum {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            boolean val = true;
            for(int j = 2; j < i; j++)
            {
                if (i % j == 0) {
                    val = false;
                    break;
                }
            }
            if(val && i != 1)
                System.out.print(i + " ");
        }
    }
}
