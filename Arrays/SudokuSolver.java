package Arrays;


public class SudokuSolver {

    public static void main(String[] args) {
        // 0 represents an empty cell
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            printBoard(board);
        } else {
            System.out.println("This Sudoku puzzle cannot be solved.");
        }
    }

    // Main recursive function to solve the board
    private static boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) { // Find an empty cell
                    for (int num = 1; num <= 9; num++) { // Try numbers 1-9
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num; // Tentatively place number

                            if (solve(board)) { // Recursively try to solve rest
                                return true;
                            } else {
                                board[row][col] = 0; // Backtrack!
                            }
                        }
                    }
                    return false; // No number fits, trigger backtracking
                }
            }
        }
        return true; // Puzzle solved
    }

    // Helper to check if placing 'num' at board[row][col] is legal
    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            // Check row, column, and the 3x3 sub-box simultaneously
            if (board[row][i] == num) return false;
            if (board[i][col] == num) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) return false;
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0) System.out.println("---------------------");
            for (int c = 0; c < 9; c++) {
                if (c % 3 == 0 && c != 0) System.out.print("| ");
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}