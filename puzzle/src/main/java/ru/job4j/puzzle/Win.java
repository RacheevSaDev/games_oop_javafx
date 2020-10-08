package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i=0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rsl = isMonoHorizontal(board, i, 1) || isMonoVertical(board, i, 1);
            }
        }
        return rsl;
    }

    private static boolean isMonoHorizontal(int[][] board, int index, int value) {
        boolean rsl = true;
        for (int j = 0; j < board.length; j++) {
            if (board[index][j] != value) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private static boolean isMonoVertical(int[][] board, int index, int value) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][index] != value) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
