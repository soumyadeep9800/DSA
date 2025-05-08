public class aaa13 {
    static int check = 0; // Global variable to track if the solution is found

    public static boolean isValid(char[][] board, int row, int col, char num) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }
        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }
        // Check 3x3 subgrid
        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

    public static void solve(char[][] board, int row, int col) {
        // If we've reached the end of the board, mark as solved
        if (row == 9) {
            check = 1;
            return;
        }
        // Skip pre-filled cells
        if (board[row][col] != '.') {
            if(col!=8)solve(board, row, col + 1);
            else solve(board, row + 1, 0);
        }
        else{
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isValid(board, row, col, ch)) {
                board[row][col] = ch; 
                if(col!=8)solve(board, row, col + 1);
                else solve(board, row + 1, 0);
                if (check == 1) return; // Stop further recursion if solved
                board[row][col] = '.'; // Backtrack
            }
        }
        }
    }
    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        // Print the solved Sudoku board
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
