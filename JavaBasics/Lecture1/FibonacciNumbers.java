import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want of the fibonacci number ");
        int number = input.nextInt();
//        input.close();
//        int a = 0;
//        int b = 1;
//
//        int count = 2;
//        while (count <= number) {
//            int temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println("The Fibonacci Number is "+b);

        for (int i = 0; i < number; i++) {
            System.out.println(fibonacciFormula(i));
        }
    }

    static long fibonacciFormula(int n){
        return (long) ((Math.pow((1+Math.sqrt(5))/2, n))/Math.sqrt(5));
    }
}
