public class ReverseNumber {
    public static void main(String[] args) {
        int number = 3567;
        int ans = 0;
        while (number != 0) {
            int lastdigit = number % 10;
            ans = ans*10 + lastdigit;
            number /= 10;
        }
        System.out.println(ans);
    }
}
