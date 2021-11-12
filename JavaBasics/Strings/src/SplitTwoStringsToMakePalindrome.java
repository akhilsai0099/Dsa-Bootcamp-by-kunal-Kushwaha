public class SplitTwoStringsToMakePalindrome {
    public static void main(String[] args) {
        String a = "ulacfd", b = "jizalu";
        System.out.println(( isPalindrome(a,b )));

    }
//    static boolean checkPalindromeFormation(String a, String b) {
//
//    }

    static boolean isPalindrome(String a, String b){
        int start = 0;
        int end = a.length()-1;
        while(start <= end ){
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
