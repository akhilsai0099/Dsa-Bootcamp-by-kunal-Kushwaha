public class subseq {
    public static void main(String[] args) {
        subseq("abc","");
    }

    static void subseq(String up, String p){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        subseq(up.substring(1),p);
        subseq(up.substring(1),p+up.charAt(0));

    }
}
