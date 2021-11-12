import java.util.Arrays;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "rick";
        String typed = "kric";
        System.out.println(isLongPressedName(name, typed));
    }
    static boolean isLongPressedName(String name, String typed) {
        int[] names = new int[26];
        int[] types = new int[26];
        for (int i = 0; i < name.length(); i++) {
            names[name.charAt(i) - 'a']++;
        }
        for (int i = 0; i < typed.length(); i++) {
            types[typed.charAt(i) - 'a']++;
        }

        for (int i = 0; i < names.length; i++) {
            if (!(types[i]>= names[i])){
                return false;
            }
        }
        if(name.length() == typed.length()){
            for(int i = 0; i <name.length(); i++){
                if(name.charAt(i) != typed.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}


