import java.util.Scanner;

public class Player {

    char user;

    public Player(char userCharacter) {
        this.user = userCharacter;
    }

    public char getUser() {
        return user;
    }

    public void move(Scanner scannerNextMove, Board boardObject) {
        String inputFromUser;
        while (true) {
            System.out.println(user + " please make your move, please choose 1-9.");
            inputFromUser = scannerNextMove.nextLine();
            if (boardObject.spotNotOccupied(Integer.parseInt(inputFromUser))) {
                break;
            } else {
                System.out.println(inputFromUser +" is occupied.");
            }
        }

        boardObject.turnMove(inputFromUser, user);
    }
}
