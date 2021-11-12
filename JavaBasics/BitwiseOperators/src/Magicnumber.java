public class Magicnumber {
    public static void main(String[] args) {
        int num = 6;
        int sum= 0;
        int base = 5;
        while(num>0){
            int last = num&1;

            num = num >> 1;
            sum += base*last;
            base *= 5;
        }
        System.out.println(sum);
    }
}
