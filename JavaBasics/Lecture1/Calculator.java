import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operation ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-'|| op == '*' || op == '/'|| op == '%') {
                System.out.println("Enter the number 1");
                int num1 = input.nextInt();
                System.out.println("Enter the number 2");
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }

                System.out.println("The answer is "+ ans);
            }
            else{
                break;
            }
        }

        

    }
}
