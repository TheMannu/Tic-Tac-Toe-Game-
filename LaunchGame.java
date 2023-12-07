
package TicTacToeGame;

public class LaunchGamecheck {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

        Player p1 = new PlayerHuman("Boy", 'X');
        Player p2 = new PlayerAI("Computer", 'O');

        Player currPlay;
        currPlay = p1;

        while (true) {
            System.out.println(currPlay.name + "'s turn ");
            currPlay.moveMaker();

            TicTacToe.displayBoard();

            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
                System.out.println(currPlay.name + " Has Won!");
                break;

            } else if (TicTacToe.checkDraw()) {
                System.out.println("Game is Draw");
                break;

            } else {
                if (currPlay == p1) {
                    currPlay = p2;
                } else {
                    currPlay = p1;
                }
            }
        }
    }
}
