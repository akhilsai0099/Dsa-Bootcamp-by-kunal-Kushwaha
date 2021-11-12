public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }

    static boolean isPerfectSquare(int x) {
        if (x == 0 || x == 1) return true;
        int start = 2;
        int end = x/2;


        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (mid*mid == x) return true;
            if (mid > x / mid) end = mid -1;

            else start = mid + 1;


        }
        return false;
    }
}
