import java.security.spec.RSAOtherPrimeInfo;

public class FindNumbersWithEvenNumbers {
    public static void main(String[] args) {
        int[] nums= {555,901,482,1771};
        System.out.println(numberofDigits(15275));
    }

    static int numberofDigits(int num){
        if (num < 0){
            num *= -1;
        }
        return (int)Math.log10(num)+1;
    }

    static int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (numberofDigits(num) %2 ==0){
                counter++;
            }
        }
        return counter;
    }

}
