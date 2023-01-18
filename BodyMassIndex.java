import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        int weight = scanner.nextInt();
        System.out.print("Enter your height in m (Example: 1.67): ");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
