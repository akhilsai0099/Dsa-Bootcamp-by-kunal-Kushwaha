public class SpecialFibonacci {
    public static void main(String[] args) {
        int a = 86 ,b = 77 , n = 15;
        System.out.println(specialFib(a,b,n));
    }

    static int specialFib(int a , int b , int n){
        if (n == 0) return a;
        if (n ==1 ) return b;
        return specialFib(a,b,n-1) ^ specialFib(a,b,n-2);
    }

}
