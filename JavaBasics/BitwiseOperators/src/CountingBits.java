import java.util.function.BinaryOperator;

public class CountingBits {
    public static void main(String[] args) {

    }

    static int[] countBits(int n){
        int[] ans= new int[n+1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = countNBits(i);
        }
        return ans;
    }

    static int countNBits (int n){
        if (n == 0) return 0;
        int count = 0;
        while( n != 0){
            n = n & (n-1);
            count++;
        }

        return count;
    }
}
