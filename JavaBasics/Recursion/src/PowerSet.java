import java.util.Arrays;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";

        powerSet(s);
    }

    static void permutateRec(String s, int n , int index , String curr){
        if (n == index) return ;
        System.out.println(curr);
        for (int i = index + 1; i < n; i++) {
            curr += s.charAt(i);
            permutateRec(s,n, i,curr);

            curr = curr.substring(0,curr.length() -1);
        }
        return;
    }

    static void powerSet(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        permutateRec(new String(arr), arr.length, -1, "");
    }
}
