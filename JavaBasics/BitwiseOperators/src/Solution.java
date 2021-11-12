public class Solution {

    public static void main(String[] args) {
        System.out.println((countPrimeSetBits(10,15)));
    }
    static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i<=right ; i++ ){
            int num = countBits(i);
            if(isPrime(num)) count++;
        }
        return count;
    }

    static int countBits(int a){
        if(a == 0) return 0;
        int count = 0;
        while(a!= 0){
            a = a & (a-1);
            count++;
        }

        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
