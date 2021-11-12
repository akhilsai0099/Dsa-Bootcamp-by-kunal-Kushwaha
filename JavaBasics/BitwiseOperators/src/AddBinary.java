public class AddBinary {
    public static void main(String[] args) {
        String a = "10101";
    }

    static String addBinary(String a, String b){
        if (a == null || a.isEmpty()){
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }

        StringBuilder builder = new StringBuilder();
        int l1 = a.length();
        int l2 = b.length();
        int carry = 0;

        while(l1 >= 0 || l2 >= 0){
            int d1 = l1>=0 ? a.charAt(l1--) - '0' : 0;
            int d2 = l2>=0 ? a.charAt(l2--) - '0' : 0;
            int sum = carry + d1 + d2;

            builder.append(sum%2);
            carry =  carry /2;
        }
        if (carry>0 ) builder.append(carry);

        return builder.reverse().toString();


    }
}
