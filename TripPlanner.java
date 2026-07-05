import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI Trip Planner =====");

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Budget (₹): ");
        int budget = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Interest (Beach/Hill Station/Adventure/Temple): ");
        String interest = sc.nextLine();

        System.out.println("\n===== Your Trip Plan =====");
        System.out.println("Destination : " + destination);
        System.out.println("Budget      : ₹" + budget);
        System.out.println("Days        : " + days);
        System.out.println("Interest    : " + interest);

        System.out.println("\nSuggested Plan:");

        if (budget < 5000) {
            System.out.println("- Stay in budget hotels.");
            System.out.println("- Use public transport.");
        } else if (budget <= 15000) {
            System.out.println("- Stay in 3-star hotels.");
            System.out.println("- Visit popular tourist attractions.");
        } else {
            System.out.println("- Stay in luxury hotels.");
            System.out.println("- Book guided tours.");
        }

        System.out.println("- Enjoy local food.");
        System.out.println("- Capture memorable photos.");
        System.out.println("- Have a safe journey!");

        sc.close();
    }
}