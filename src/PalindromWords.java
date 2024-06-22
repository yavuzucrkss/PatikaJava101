public class PalindromWords {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Abba"));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        return str.contentEquals(reverse);
    }
}
