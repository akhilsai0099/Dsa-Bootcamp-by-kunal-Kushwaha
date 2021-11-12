public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));

    }

    static boolean checkIfPangram(String sentence) {
        boolean[] marks = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'a' && sentence.charAt(i)<='z'){
                marks[sentence.charAt(i) -'a'] = true;
            }
        }

        for (boolean mark : marks){
            if (mark == false){
                return false;
            }
        }
        return true;
    }
}
