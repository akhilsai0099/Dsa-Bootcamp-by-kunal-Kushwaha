//import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
//        Scanner in  = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 36;
        System.out.println(mySqrt(n));
    }

    static int mySqrt(int x) {
        if(x == 0 ){
            return x;
        }
        int start = 1;
        int end = x;
        while(start < end){
            int mid = start + (end - start )/2;
            if(mid* mid > x){
                end = mid ;
            }
            else if (mid * mid <= x){
                return mid;
            }

        }
        return start;
    }
}
