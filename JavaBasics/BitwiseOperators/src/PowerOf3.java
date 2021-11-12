public class PowerOf3 {
    public static void main(String[] args) {
//        int base = 3;
//        int power = 6;
//        int ans = 1;
//        while(power >0){
//            if ((power & 1) == 1){
//                ans *= base;
//            }
//            base *= base;
//            power = power >> 1;
//        }
//        System.out.println(ans );
        System.out.println(rightMostSetBit(10));
    }

    static int rightMostSetBit(int n){
        int negativen = ~n;
        negativen +=1;
        return n & negativen;
    }

}
