public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        int num = 11;
        int num1 = 5;
        System.out.println(sumOfNatural(num1));
    }

    static int sumofDigit(int num){

        if (num ==0) return 0;

        return (num%10 + sumofDigit(num/10));
    }

    static int productOfTwo(int num1, int num2){
        if (num2 == 0) return 0;
        return num1 + productOfTwo(num1,num2-1);
    }

    static boolean isPrime(int num, int i){
        if (num<=2){
            return (num == 2) ? true : false;
        }
        if (num%i == 0) return false;
        if (i * i > num) return true;

        return isPrime(num,i+1);
    }

    static int sumOfNatural(int n){
        if(n==0) return 0;
        return n+(sumOfNatural(n-1));
    }
}
