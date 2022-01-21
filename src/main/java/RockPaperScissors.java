import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
//        input from user using scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a move!(rock/paper/scissors)");
        String playerMove = scanner.nextLine();
        //computers input
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose" + computerMove + "!");
    }

    //comparing computer vs player moves
    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }
//        printing results
    if (playerMove.equals(computerMove)){

    }
}


