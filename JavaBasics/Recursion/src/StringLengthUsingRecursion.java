public class StringLengthUsingRecursion {
    public static void main(String[] args) {
        String s = "akhil";
        System.out.println(stringLength(s));
    }

    static int stringLength(String s){
        if (s.equals(""))
            return 0;
        else
            return stringLength(s.substring(1)) + 1;
    }

}
