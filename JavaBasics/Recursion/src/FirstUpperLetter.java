//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class FirstUpperLetter {
    public static void main(String[] args) {
        String name = "akhilSai";
        int n = 0;
        System.out.println(firstUpperChar(name, n));
    }

    static char firstUpperChar(String s , int n){
        if (s.charAt(n) == '\0') return 0;
        if (Character.isUpperCase(s.charAt(n))) return s.charAt(n);

        return firstUpperChar(s,n+1);

    }
}
