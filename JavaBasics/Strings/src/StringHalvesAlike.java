public class StringHalvesAlike {
    public static void main(String[] args) {
        String s = "MerryChristmas";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        String s1 = s.substring(0,(s.length()/2));
        String s2 = s.substring((s.length()/2),s.length());
        int s1vowels = 0;
        int s2vowels = 0;
        for (int i = 0; i < s1.length(); i++) {
            if ((s1.charAt(i) == 'a'|| s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) =='u' ||s1.charAt(i) =='A'||
                    s1.charAt(i) =='E' || s1.charAt(i) =='I' || s1.charAt(i) =='O' || s1.charAt(i) =='U')){
                s1vowels++;
            }
            if ((s2.charAt(i) == 'a'|| s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) =='u' ||s2.charAt(i) =='A'||
                    s2.charAt(i) =='E' || s2.charAt(i) =='I' || s2.charAt(i) =='O' || s2.charAt(i) =='U')){
                s2vowels++;
            }

        }
        return s1vowels == s2vowels;
    }
}
