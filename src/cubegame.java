import java.util.Scanner;
import java.util.Random;

public class cubegame {

    public static void main(String[] args) {
        int randomNumberOfComputer = 0;

        int amountOfWinsComputer = 0;
        int amountOfWinsPlayer = 0;
        boolean cubegame = false;
        System.out.println("Drücken sie die 1 für ihren ersten wurf");

        Random random = new Random();
        int randomNumber = random.nextInt(6, 36);

        while(cubegame==false) {

            //System.out.println(randomNumber);
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                randomNumberOfComputer = random.nextInt(1, 6);
                // player

                System.out.println("Sie haben " + randomNumberOfComputer + " gewürfelt!");
                System.out.println("Drücken sie die 2 für ihren zweiten wurf");
            }

            else if (selection == 2) {
                 randomNumberOfComputer = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumberOfComputer + " gewürfelt!");
                System.out.println("Drücken sie die 3 für ihren dritten wurf");
            }

            else if (selection == 3) {
                int randomNumber1 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber1 + " gewürfelt!");
                System.out.println("Drücken sie die 4 für ihren vierten wurf");
            }

            else if (selection == 4) {
                int randomNumber1 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber1 + " gewürfelt!");
                System.out.println("Drücken sie die 5 für ihren fünften wurf");
            }

            else if (selection == 5) {
                int randomNumber1 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber1 + " gewürfelt!");
                System.out.println("Drücken sie die 6 für ihren sechsten wurf");
            }

            else if (selection == 6) {
                int randomNumber1 = random.nextInt(1, 6);
                System.out.println("Sie haben " + randomNumber1 + " gewürfelt!");
                //System.out.println("Drücken sie die 6 für ihren sechsten wurf");
                System.out.println("Computer: " + randomNumber);
            }
        }


        //a = a + randomNumber1;

    }
}
