public class NumberOfStringsAppearedInaSubString {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
//        System.out.println(word.substring(0,2));
    }

    static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (int i = 0; i < patterns.length; i++) {

            int wordLength = patterns[i].length();
//            for (int j = 0; j <= (word.length() -wordLength + 1); j++) {
//                if (word.substring(j,j+wordLength-1) == patterns[i]){
//                    counter++;
//                    break;
//                }
            int j = 0;
            while (j < word.length() - wordLength + 1) {
                if (word.substring(j, j + wordLength).equals(patterns[i])) {
                    counter++;
                    break;
                }
                j++;
            }


        }
        return counter;
    }
}
