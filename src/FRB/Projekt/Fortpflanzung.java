package FRB.Projekt;
import java.util.Scanner;

public class Fortpflanzung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderungen
        System.out.println("Geben Sie bitte Ihr Alter ein:");
        int alter = scanner.nextInt();

        System.out.println("Geben Sie bitte Ihre durchschnittliche Fruchtbarkeit pro Monat ein:");
        double fruchtbarkeit = scanner.nextDouble();

        System.out.println("Hatten Sie Geschlechtsverkehr in diesem Monat?");
        String antwort = scanner.next();
        boolean hatteGeschlechtsverkehr = antwort.equalsIgnoreCase("Ja");

        System.out.println("Verwenden Sie Verhütungsmittel?");
        antwort = scanner.next();
        boolean verwendetVerhuetungsmittel = antwort.equalsIgnoreCase("Ja");

        // Berechnung der Schwangerschaftswahrscheinlichkeit
        double wahrscheinlichkeit = fruchtbarkeit;

        if (alter < 18) {
            wahrscheinlichkeit *= 0.5;
        } else if (alter > 35) {
            wahrscheinlichkeit *= 0.7;
        }

        if (hatteGeschlechtsverkehr && !verwendetVerhuetungsmittel) {
            wahrscheinlichkeit *= 0.9;
        } else if (hatteGeschlechtsverkehr && verwendetVerhuetungsmittel) {
            wahrscheinlichkeit *= 0.1;
        }

        System.out.println("Die Wahrscheinlichkeit einer Schwangerschaft beträgt " + (wahrscheinlichkeit * 100) + "%.");

        scanner.close();
    }

}


