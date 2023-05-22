import java.util.Scanner;

class Main {

    enum NewGame {
        YES, NO
    }

    public static void main(String[] args) {
        NewGame upForIt = NewGame.YES;
        while (upForIt == NewGame.YES) {
            TicTacToe ttt = new TicTacToe();
            ttt.setup();
            Scanner inString = new Scanner(System.in);
            System.out.println("Would you like to play again? (YES/NO): ");
            String mood = inString.nextLine();
            if (mood.equals("YES")) {
                System.out.println("Starting new game...");
            } else if (mood.equals("NO")) {
                System.out.println("Exiting Game. Thank you for playing.");
                upForIt = NewGame.NO;
            } else {
                System.out.println("Invalid input. Exiting game...");
                upForIt = NewGame.NO;
            }
        }
    }
}