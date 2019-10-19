package edu.cscc;
import java.util.*;

/**
 * Rock Paper Scissors Lizard Spock Game
 * @author Abdou Latif Diagne
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        /**
         * @param h_pick
         */
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            /**
             *  @param c_pick
             *  @param h_pick
             */
            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}