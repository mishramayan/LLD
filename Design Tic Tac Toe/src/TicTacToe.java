public class TicTacToe {
    private final int[][] board;
    private final int n;
    private final int[] rowSum, colSum;
    private int diagSum, revDiagSum;
    private int winner;

    public TicTacToe(final int n) {
        this.n = n;
        board = new int[n][n];
        rowSum = new int[n];
        colSum = new int[n];
    }

    /**
     * Makes a move on the board and returns the winner if the
     * move is a winning move.
     *
     * @param player is either 0 or 1
     * @param row    is the move's row index
     * @param col    is the move's col index
     * @return winner +1 if first player, -1 if second player and 0 otherwise
     * @throws IllegalArgumentException if the move is an illegal move
     * */
    public int move(int player, int row, int col) throws IllegalArgumentException {
        if(row < 0 || col < 0 || row >= n || col >= n){
            throw new IllegalArgumentException("Invalid move, out of boundary.");
        }
        if(board[row][col] != 0){
            throw new IllegalArgumentException("Invalid move, already occupied.");
        }
        if(player != 0 && player != 1){
            throw new IllegalArgumentException("Invalid move, player must be 0 or 1.");
        }
        if(getWinner() != 0){
            throw new IllegalArgumentException("Board is decided!");
        }
            board[row][col] = player;
            rowSum[row] += player;
            colSum[col] += player;
            if(rowSum[row] == Math.abs(n) || colSum[col] == Math.abs(n) || diagSum == Math.abs(n) || revDiagSum == Math.abs(n)){
                System.out.println("The winner is player: "+player);
                return player;
            }
            player = player == 0 ? -1 : +1;
            if(row == col){
                diagSum += player;
            }
            if(row == n - 1 - col){
                revDiagSum += player;
            }
            if(rowSum[row] == Math.abs(n) || colSum[col] == Math.abs(n) || diagSum == Math.abs(n) || revDiagSum == Math.abs(n)){
                System.out.println("The winner is player: "+player);
                return player;
            }
            return getWinner();
    }
    public int getWinner(){
        return winner;
    }
}
