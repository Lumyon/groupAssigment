import java.util.Scanner;

public class QnSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long minutesPerDay = 60 * 24;
        long minutesPerYear = minutesPerDay * 365;

        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;

        System.out.println(minutes + " minutes is approximately " 
                           + years + " years and " + days + " days");
    }
}
