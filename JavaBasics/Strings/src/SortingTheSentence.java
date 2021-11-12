public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    static String sortSentence(String s) {
        String[] inp = s.split(" ");
        String[] out = new String[inp.length];
        for (int i = 0; i < inp.length; i++) {
            String x = inp[i];
            int xEnd = x.length()-1;
            int idx  = Integer.parseInt(String.valueOf(x.charAt(xEnd))) - 1;
            out[idx] = x.substring(0,xEnd);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < out.length; i++) {
            ans.append(out[i]);
            if (i < out.length-1) ans.append(" ");
        }
        return ans.toString();
    }
}
