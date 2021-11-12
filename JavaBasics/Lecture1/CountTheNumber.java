import java.util.Scanner;

public class CountTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number ");
        long number = input.nextLong();
        System.out.println("Enter the value to search ");
        int value = input.nextInt();
        input.close();

        int counter = 0;
        while (number != 0) {
            long lastdigit = number % 10;
            if (lastdigit == value) {
                counter++;
            }
            number /= 10;
        }
        System.out.println("The number "+value +" repeated "+counter+" times");
    }
}
