import java.util.HashMap;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));
    }

    static boolean validPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int len = s.length();
        int i =0;
        while(i < len) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
                i++;
            } else {
                map.put(s.charAt(i), 1);
                i++;
            }
        }
        int counter = 0;
        for(Integer value : map.values()) {
            if(value%2 != 0) {
                counter++;
            }
        }
        if(counter > 2) {
            return false;
        }
        return true;

    }
}
