package RockPaperScissors;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;
    public int compareMoves(Move otherMove) {
        if(this == otherMove) {
            return 0;
        }
        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1:-1);
            case PAPER:
                return (otherMove == ROCK ? 1: -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1: -1);
        }
        return 0;
    }
}


