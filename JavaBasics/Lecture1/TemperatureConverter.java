import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius: ");
        float tempc = input.nextInt();
        input.close();
        float tempf = (tempc * 9/5) + 32;
        System.out.print(tempf);
    }
}
