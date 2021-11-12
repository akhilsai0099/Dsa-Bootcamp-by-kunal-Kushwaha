public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.printf("%.3f",newtonsSQRT(2,0.01));
    }
    static double binarySearchsqrt(int n , int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int mid = s + (e - s) /2;
            if (mid * mid ==  n) return mid;
            if (mid * mid > n) e = mid - 1;
            else if (mid * mid < n){
                s = mid +1;
            }
            else{
                root = mid;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n ){
                root += incr;
            }
            incr /= 10;
        }


        return root;
    }

    static double newtonsSQRT(int n, double p){
        double x = n;
        double root ;

        while(true){
            root = 0.5 * (x + n/x);

            if (Math.abs(root - x ) < p){
                break;
            }
            x = root;
        }
        return root;
    }
}
