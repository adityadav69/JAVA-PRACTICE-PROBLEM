import java.util.*;

public class Pr01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Enter 1 if you want to continue or 0 to finish");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is " + oddSum);

    }
}
