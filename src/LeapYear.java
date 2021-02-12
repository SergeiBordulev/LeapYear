import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year:");
        int enteredYear = scanner.nextInt();

        if (enteredYear % 4 == 0 && (enteredYear % 100 != 0 || enteredYear % 400 == 0)) {
            System.out.println(enteredYear + " it is a leap year");
        } else {
            System.out.println(enteredYear + " it is a not leap year");
        }
    }
}
