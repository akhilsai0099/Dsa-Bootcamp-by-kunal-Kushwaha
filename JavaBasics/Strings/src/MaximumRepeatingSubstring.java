import java.util.Arrays;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababc", word = "aba";
        System.out.println(maxRepeating(sequence,word));
    }
    static int maxRepeating(String sequence, String word) {
        int wordlength = word.length();
        int count = 0;
        for (int i = 0; i < (sequence.length() - word.length() +1); i++) {
            if (sequence.substring(i, i+wordlength).equals(word)){
                count++;
            }
        }
        return count;
    }
}
