public class Geekonacci {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 2,n = 5;
        System.out.println(geekonacci(a,b,c,n));
    }

    static int geekonacci(int a, int b , int c, int n) {
        if (n == 1) return a;
        else if (n == 2) return b;
        else if (n == 3) return c;
        else {
            return geekonacci(a, b, c, n - 1) + geekonacci(a, b, c, n - 2) + geekonacci(a, b, c, n - 3);
        }
    }
}
