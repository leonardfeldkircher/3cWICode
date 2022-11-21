package java;

import java.util.Scanner;
import java.util.Random;

public class cubegame {

    public static void main(String[] args) {

        int randomNumber1 = 0;
        int randomNumber2 = 0;
        int randomNumber3 = 0;
        int randomNumber4 = 0;
        int randomNumber5 = 0;
        int randomNumber6 = 0;

        boolean cubegame = false;
        System.out.println("Drücken sie die 1 für ihren ersten wurf");

        Random random = new Random();
        int randomNumber = random.nextInt(6, 36);

        while (cubegame == false) {

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                randomNumber1 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber1 + " gewürfelt!");
                System.out.println("Drücken sie die 2 für ihren zweiten wurf");
            } else if (selection == 2) {
                randomNumber2 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber2 + " gewürfelt!");
                System.out.println("Drücken sie die 3 für ihren dritten wurf");
            } else if (selection == 3) {
                randomNumber3 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber3 + " gewürfelt!");
                System.out.println("Drücken sie die 4 für ihren vierten wurf");
            } else if (selection == 4) {
                randomNumber4 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber4 + " gewürfelt!");
                System.out.println("Drücken sie die 5 für ihren fünften wurf");
            } else if (selection == 5) {
                randomNumber5 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber5 + " gewürfelt!");
                System.out.println("Drücken sie die 6 für ihren sechsten wurf");
            } else if (selection == 6) {
                randomNumber6 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber6 + " gewürfelt!");

                int a = randomNumber1;
                int b = randomNumber2;
                int c = randomNumber3;
                int d = randomNumber4;
                int e = randomNumber5;
                int f = randomNumber6;

                System.out.println("Augenzahl des Computers: " + randomNumber);
                System.out.println("Ihre Augenzahl: " + (a + b + c + d + e + f));

                if (randomNumber>(a+b+c+d+e+f)) {
                    System.out.println("Sie haben Verloren");
                }
                else if (randomNumber==(a+b+c+d+e+f)){
                    System.out.println("Unentschieden!");
                }
                else {
                    System.out.println("Sie haben Gewonnen");
                    cubegame = true;

                }
            }
        }
    }
}
