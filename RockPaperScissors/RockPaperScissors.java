package RockPaperScissors;


public class RockPaperScissors {
    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;

    public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    private void startGame() {
        do {
            Move userMove = user.getMove();
            Move computerMove = computer.getMove();
            int result = userMove.compareMoves(computerMove);
            switch (result) {
                case 0:
                    System.out.println("Нічия!");
                    break;
                case 1:
                    System.out.println("Ти переміг!");
                    userScore++;
                    break;
                case -1:
                    System.out.println("Ти програв!");
                    computerScore++;
                    break;
            }
            numberOfGames++;
        }
        while (user.playAgain());
        printGameStats();
    }

    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;
        System.out.println("+----------------------------------------------------------------+");
        System.out.printf("| %6s | %6s | %6s | %12s | %14s       |",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");
        System.out.println();
        System.out.printf("| %-6d | %-6d | %-6d | %-12d | %-18.2f%%  |\n", wins, losses, ties, numberOfGames, percentageWon);
        System.out.println("+----------------------------------------------------------------+");

    }
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
}