import java.util.Random;
import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args){

        int[][] playGround = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean isPlayerOne = true;

        printField(playGround);

        while(true){
            String inputOfUser = scanner.next();

            String[] arr = inputOfUser.split(",");
            System.out.println(arr);

            int x = Integer.valueOf(arr[0]);
            int y = Integer.valueOf(arr[1]);
            playGround[x][y] = 1;

            printField(playGround);

            if (isPlayerOne){
                isPlayerOne = false;
            } else {
                isPlayerOne = true;
            }
            System.out.println(isPlayerOne);
            System.out.println(isPlayerOne);
        }
    }

    public static void printField(int[][] playGround){
        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + " ");
            }
            System.out.println();
        }
    }
}