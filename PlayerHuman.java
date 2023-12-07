package TicTacToeGame;

import java.util.Scanner;

public class PlayerHuman extends Player {

    PlayerHuman(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void moveMaker() {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("Enter the Row and Col");
            row = sc.nextInt();
            col = sc.nextInt();
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);
    }
}
