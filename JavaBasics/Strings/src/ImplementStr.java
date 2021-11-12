public class ImplementStr {
    public static void main(String[] args) {

    }

    static int strStr(String haystack, String needle) {
        if (needle == ""){
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
