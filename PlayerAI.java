package TicTac;

import java.util.Random;

public class PlayerAI extends Player {

    PlayerAI(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void moveMaker() {
        int row;
        int col;
        do {
            Random rndm = new Random();
            row = rndm.nextInt(3);
            col = rndm.nextInt(3);
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);
    }
}
