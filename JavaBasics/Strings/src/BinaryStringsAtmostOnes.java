public class BinaryStringsAtmostOnes {
    public static void main(String[] args) {
        String s = "110010111";
        System.out.println(checkOnesSegment(s));
    }

    static boolean checkOnesSegment(String s) {
        if (s.length() == 1) return true;
        int i= 0;
        int counter =0;
        while(i< s.length()-1){
            if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                int j= i+1;
                counter++;
                while (j < s.length()) {
                    if (s.charAt(j) == '0'|| j == s.length()-1) {
                        i = j;
                        break;
                    }
                    j++;
                }
            }
            i++;
        }

        return counter>=1;
    }
}
