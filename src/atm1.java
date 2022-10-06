import java.util.Scanner;

public class atm1 {
    public static void main(String[] args) {

    boolean atmisrunning = false;

        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(atmisrunning==false) {


            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel möchten sie einzahlen?");
                int deposit = scanner.nextInt();
                System.out.println("Sie haben " + deposit + " eingezahlt!");
                balance = balance + deposit;
            }

            else if (selection == 2) {
                System.out.println("Wie viel möchten sie abheben?");
                int payoff = scanner.nextInt();
                System.out.println("Sie haben " + payoff + " abgehoben!");
                balance = balance - payoff;
            }

            else if (selection == 3) {
                System.out.println("Der kontostand beträgt: " + balance);
            }

            else if (selection == 4) {
                atmisrunning = true;
                System.out.println("Auf Wiedersehen!");
            }

        }
    }
}
