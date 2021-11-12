public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] ans = sieveOfEratosthenes(100);
        System.out.println(ans[11]);
    }

    static boolean[] sieveOfEratosthenes(int n){
        boolean[] sieve  = new boolean[n+1];
        sieve[0] = false;
        sieve[1] = false;
        int i= 2;

        while(i*i<=n){
            if (isPrime(i)){
                sieve[i] = true;
                int j= i;
                while(j*i<= n){
                    sieve[j*i] = false;
                    j *= i;
                }
            }
        i += 1;
        }

        return sieve;
    }
    static boolean isPrime(int n){
        if (n<= 1) return false;

        for (int i = 2; i * i  <= n ; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
