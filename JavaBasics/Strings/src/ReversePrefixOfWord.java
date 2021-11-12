public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    static String reversePrefix(String word, char ch) {
        StringBuilder builder = new StringBuilder();
        int chIndex = 0;
        int i =0;
        boolean isCharinWord = true;
        while(i<word.length()){
            if (word.charAt(i) == ch) {
                chIndex = i;
                isCharinWord = true;
                break;
            }else{
                isCharinWord = false;
            }
            i++;
        }
        if (!isCharinWord) return word;
        while(chIndex >=0){
            builder.append(word.charAt(chIndex));
            chIndex--;
        }
        i++;
        while (i < word.length()) {
            builder.append(word.charAt(i));
            i++;
        }
        return builder.toString();
    }


}
