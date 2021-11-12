import java.util.Arrays;

public class balancedParenthesis {
    public static void main(String[] args) {

    }
    static boolean balancedParenthesis(char[] arr, int n){
        if (n == 0) return true;
        if (n == 1) return false;
        if (arr[0] == '}' || arr[0] == ']' || arr[0] == ')') return false;

        char closing = closingChar(arr[0]);

        int i, count = 0;
        for (i = 0; i < n; i++) {
            if (arr[0] == arr[i]) count++;
            if (arr[i] == closing)
                if (count == 0) break;
                count--;
        }

        if (i == n) return false;

        if (i == 1) return balancedParenthesis(Arrays.copyOfRange(arr,i+1,n),n-2);

        return balancedParenthesis(Arrays.copyOfRange(arr, 1, n), i - 1) && balancedParenthesis(Arrays.copyOfRange(arr, (i + 1), n), n - i - 1);
    }

    static char closingChar(char start){
        if (start == '{') return '}';
        else if(start == '[') return ']';
        else if(start == '(') return ')';
        return Character.MIN_VALUE;
    }
}
