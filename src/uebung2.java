import java.util.Random;

public class uebung2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        Random random1 = new Random();
        int randomNumber1 = random.nextInt(100);

        System.out.println(randomNumber);
        System.out.println(randomNumber1);

        if ((randomNumber < randomNumber1) && (randomNumber < 50)) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2" + " Mini");
        } else if ((randomNumber < 30) || (randomNumber1 < 30)) {
            System.out.println("Eine der beiden ist kleiner als 30");
        } else if ((randomNumber < 50) && (randomNumber1 != 50)) {
            System.out.println("Eine der beiden ist kleiner als 30");
        } else {
            System.out.println();
        }
    }
}
        // Erstelle zwei Zufallszahl zwischen 0 und 100

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"

