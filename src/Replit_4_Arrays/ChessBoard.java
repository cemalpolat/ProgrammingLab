package Replit_4_Arrays;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];

        for (int i = 0, k =1; i < chessBoard.length; i++, k++) {

            for (char j = 0, l = 'a'; j < chessBoard.length; j++, l++) {

                chessBoard[i][j] = "" + k + l;
            }
        }
        System.out.println(Arrays.deepToString(chessBoard));

    }
}
