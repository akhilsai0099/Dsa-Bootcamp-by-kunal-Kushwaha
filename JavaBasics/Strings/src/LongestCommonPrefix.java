public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str= {"cir","car"};
        System.out.println((longestCommonPrefix(str)));
    }

    static String longestCommonPrefix(String[] strs) {
        int minSize = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            minSize = Integer.min(minSize, strs[i].length());
        }
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < minSize; i++) {
            boolean isloopBroken = false;
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch ){
                    isloopBroken = true;
                    break;
                }
            }
            if (!isloopBroken){
                builder.append(ch);
            }
            if (isloopBroken){
                break;
            }
        }
        return builder.toString();
    }
}

