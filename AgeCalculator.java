import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year (e.g., 1990): ");
        int year = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        if (birthDate.isAfter(today)) {
            System.out.println("The birth date cannot be in the future.");
        } else {
            Period age = Period.between(birthDate, today);
            System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        }
        scanner.close();
    }
}
