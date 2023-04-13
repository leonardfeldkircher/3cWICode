package calculator;

import java.util.Scanner;

public class calculator1 {
    public calculator1(double zahl1, double zahl2) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        double zahl1 = scanner.nextDouble();

        System.out.println("Geben Sie die zweite Zahl ein:");
        double zahl2 = scanner.nextDouble();

        System.out.println("Geben Sie die Rechnungsart ein:");
        int InvoiceType = scanner.nextInt();

        if (InvoiceType == 1) {
            System.out.println("Ergebniss:" + zahl1 + zahl2);
        } else if (InvoiceType == 2) {
            System.out.println("Ergebniss:" + zahl1 + zahl2);
        } else if (InvoiceType == 3) {
            System.out.println("Ergebniss:" + zahl1 * zahl2);
        } else if (InvoiceType == 4){
            System.out.println("Ergebniss:" + zahl1 / zahl2);
        }
    }
}
