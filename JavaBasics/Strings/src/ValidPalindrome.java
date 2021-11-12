import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        System.out.println(isPalindrome(s));
//        System.out.println(s.toLowerCase());
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ignore = ",.';:? {}[]/?=+_-!@#$%^&*()\\\"";
        int start = 0;
        int end = s.length() -1;
        while (start < end) {
            if (ignore.contains(String.valueOf(s.charAt(start)))){
                start++;
            }
            else if (ignore.contains(String.valueOf(s.charAt(end)))){
                end--;
            }
            else{
                if (s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}
