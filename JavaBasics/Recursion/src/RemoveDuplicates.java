public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aaakkkhill";
        System.out.println(removeDuplicate(s));
    }

    static String removeDuplicate(String s){
        if (s.length() <= 1) return s;

        if (s.charAt(0) == s.charAt(1)) return removeDuplicate(s.substring(1));
        else {
            return s.charAt(0)+ removeDuplicate(s.substring(1));
        }
    }
}
