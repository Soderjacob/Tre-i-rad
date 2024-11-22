public class Rules {

    public boolean checkWinner(Board boardObject, char symbol) {
        char[][] board = boardObject.getBoard();
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            boardObject.playBoard();
            System.out.println(symbol + " is the winner!");
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            for (int x = 0; x < board[i].length; x++) {
                if (board[i][x] == ' ') {
                    return false;
                }
            }
        }
        boardObject.playBoard();
        System.out.println("Game Over! Result is Tied.");

        return true;

    }

}
