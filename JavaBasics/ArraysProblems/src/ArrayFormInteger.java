import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
        long[] num = {9,9,9,9,9,9,9,9,9,9};

        System.out.println(addToArrayForm(num,1));

    }

    static List<Long> addToArrayForm(long[] num, int k) {
        long sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum *10 + num[i];
        }
        int counter = 0;
        long finalAns = sum+k;
        List<Long> ans = new ArrayList<Long>();
        while(finalAns !=0){
            long lastDigit = finalAns %10;
            ans.add(counter,lastDigit);
            counter++;
            finalAns /=10;
        }
        Collections.reverse(ans);
        return ans;

    }
}
