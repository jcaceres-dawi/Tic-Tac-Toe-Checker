package Dificultad5kyu;

public class TicTacToeChecker {
    public static void main(String[] args) {
        System.out.println(isSolved(new int[][] {
                { 2, 0, 0 },
                { 1, 1, 2 },
                { 2, 1, 1 }
        }));
    }

    public static int isSolved(int[][] board) {

        boolean empate = true;

        // Ganador fila
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < 1; j++) {
                if ((board[i][j] == 1) && (board[i][j + 1] == 1) && (board[i][j + 2] == 1)) {
                    return 1;
                }
                if ((board[i][j] == 2) && (board[i][j + 1] == 2) && (board[i][j + 2] == 2)) {
                    return 2;
                }
            }
        }

        // Ganador columna
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((board[i][j] == 1) && (board[i + 1][j] == 1) && (board[i + 2][j] == 1)) {
                    return 1;
                }
                if ((board[i][j] == 2) && (board[i + 1][j] == 2) && (board[i + 2][j] == 2)) {
                    return 2;
                }
            }
        }

        // Ganador diagonal
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <= i; j++) {
                if ((board[i][j] == 1) && (board[i + 1][j + 1] == 1) && (board[i + 2][j + 2] == 1)) {
                    return 1;
                }
                if ((board[i][j] == 2) && (board[i + 1][j + 1] == 2) && (board[i + 2][j + 2] == 2)) {
                    return 2;
                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <= i; j++) {
                if ((board[i][j + 2] == 1) && (board[i + 1][j + 1] == 1) && (board[i + 2][j] == 1)) {
                    return 1;
                }
                if ((board[i][j + 2] == 2) && (board[i + 1][j + 1] == 2) && (board[i + 2][j] == 2)) {
                    return 2;
                }
            }
        }

        // Comprobar empate
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < 1; j++) {
                if ((board[i][j] == 0) || (board[i][j + 1] == 0) || (board[i][j + 2] == 0)) {
                    empate = false;
                }
            }
        }

        if (empate) {
            return 0;
        }

        return -1;
    }
}
