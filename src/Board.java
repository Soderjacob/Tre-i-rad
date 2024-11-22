public class Board {

    public char[][] getBoard() {
        return board;
    }

    char[][] board = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    public void playBoard() {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-----");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-----");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public void turnMove(String spot, char symbol) {
        switch(spot) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;

            default:
                System.out.println(":(");
        }
    }

    public boolean spotNotOccupied (int spot) {
        switch(spot) {
            case 1:
                if (board[0][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (board[0][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (board[0][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (board[1][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (board[1][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (board[1][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (board[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (board[2][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (board[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

}
