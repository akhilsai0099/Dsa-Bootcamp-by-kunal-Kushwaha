public class SkipAChar {
    public static void main(String[] args) {
        String s = "aabeaaebb";
        System.out.println((skipAppnotApple("satehuappleaeapp")));
    }

    static void skipChar(String s, StringBuilder ans){
        if (s.isEmpty()) return;

        char ch = s.charAt(0);
        if (ch == 'a') {
            skipChar(s.substring(1), ans);
        }
        else{
            ans.append(ch);
            skipChar(s.substring(1), ans);
        }
    }

    static String skipApple(String s){
        if (s.isEmpty()) return "";

        if (s.startsWith("apple")) {
            return skipApple(s.substring(5));
        }
        else {
            return (s.charAt(0) + skipApple(s.substring(1)));
        }
    }

    static String skipAppnotApple(String s){
        if (s.isEmpty()) return "";

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppnotApple(s.substring(3));
        }
        else {
            return (s.charAt(0) + skipAppnotApple(s.substring(1)));
        }
    }

}
