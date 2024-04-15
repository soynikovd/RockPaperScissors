package RockPaperScissors;

import java.util.Scanner;

public class User {
    Scanner scanner;

    public User () {
        scanner = new Scanner(System.in);
    }
    public Move getMove() {
        System.out.println("Камінь, ножиці або папір?");
        String userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLater = userInput.charAt(0);
        if (firstLater == 'К' || firstLater == 'Н' || firstLater == 'П') {
            switch (firstLater) {
                case 'К':
                    return Move.ROCK;
                case 'Н':
                    return Move.SCISSORS;
                case 'П':
                    return Move.PAPER;
            }
        }
        return getMove();
    }
    public boolean playAgain() {
        System.out.println("Хочете зіграти ще раз?");
        String userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Т';
    }
}
