import java.util.Random;
import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args){

        int[][] playGround = new int[3][3];

        playGround[0][0] = 1;

        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + " ");
            }
            System.out.println();
        }

        boolean ticTacToe = false;
        System.out.println("Spieler 1 beginnt!");


        while (ticTacToe == false) {

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            //if (selection == ("0,0")) {
                //playGround.length = row;
            }
        }
    }
}
