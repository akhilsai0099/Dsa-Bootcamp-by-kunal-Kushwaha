import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "aiohn";
        int[] index = {3,1,4,2,0};
        System.out.println(restoreString(s,index));
    }

    static String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        for (char cha : ans) {
            sb.append(cha);
        }
        return sb.toString();
    }
}
