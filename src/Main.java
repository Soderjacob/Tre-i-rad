import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        Player user1 = new Player('X');
        Player user2 = new Player('O');
        Rules gameOver = new Rules();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dags för luffarschack! För att börja spela skriv spela, för att avsluta spelet skriv \"exit\"");

        while (!scanner.nextLine().equalsIgnoreCase("exit")) {

            board.playBoard();
            playRound(user1, scanner, board, gameOver, user2);
            System.out.println("Dags för luffarschack! För att börja spela skriv spela, för att avsluta spelet skriv \"exit\"");

        }

    }

    private static void playRound(Player user1, Scanner scanner, Board board, Rules gameOver, Player user2) {
        while (true) {
            user1.move(scanner, board);
            if (gameOver.checkWinner(board, user1.getUser())) {
                break;
            }

            board.playBoard();

            user2.move(scanner, board);
            if (gameOver.checkWinner(board, user2.getUser())) {
                break;
            }

            board.playBoard();
        }
    }

}