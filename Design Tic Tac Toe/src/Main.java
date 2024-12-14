

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);
        ticTacToe.move(1, 0, 0);
        ticTacToe.move(0, 0, 1);
        ticTacToe.move(1, 1, 1);
        ticTacToe.move(0, 2, 0);
        ticTacToe.move(1, 2, 2);
    }
}