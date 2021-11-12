import java.util.Arrays;

public class DecryptStringNumbertoAlphabet {
    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        freqAlphabets(s);
    }
    static String freqAlphabets(String s) {
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c.length; i++) {

            sb.append((i+2 < c.length && c[i+2] == '#') ?
                    (char)(Integer.parseInt(s.substring(i, i+=2))+96) :
                    (char)(Character.getNumericValue(c[i])+96));
        }

        return sb.toString();
    }

}
