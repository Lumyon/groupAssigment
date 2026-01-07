import java.util.Scanner;

public class QnFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        double rate = input.nextDouble();

        double gratuity = subtotal * rate / 100;
        double total = subtotal + gratuity;

        System.out.printf("The gratuity is %.2f and total is %.2f", gratuity, total);
    }
}
