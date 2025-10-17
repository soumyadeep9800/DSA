//Rotten-Orange, Multi-Source-BFS
import java.util.*;

public class aaa12 {
    // Function to calculate minimum minutes to rot all oranges
    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        // Step 1: Find all initially rotten oranges and count fresh ones
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    freshCount++;
                }
            }
        }
        // If no fresh oranges at the start
        if (freshCount == 0) return 0;
        int minutes = 0;
        // Step 2: BFS traversal (minute by minute)
        while (!queue.isEmpty()) {
            boolean rottenThisMinute = false;

            for (int i = 0; i < queue.size(); i++) {
                int[] pos = queue.poll();
                int r = pos[0];
                int c = pos[1];
                // Down
                if (r + 1 < rows && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    freshCount--;
                    queue.offer(new int[]{r + 1, c});
                    rottenThisMinute = true;
                }
                // Up
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    freshCount--;
                    queue.offer(new int[]{r - 1, c});
                    rottenThisMinute = true;
                }
                // Right
                if (c + 1 < cols && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    freshCount--;
                    queue.offer(new int[]{r, c + 1});
                    rottenThisMinute = true;
                }
                // Left
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    freshCount--;
                    queue.offer(new int[]{r, c - 1});
                    rottenThisMinute = true;
                }
            }
            if (rottenThisMinute) minutes++;
        }
        // Step 3: If any fresh left, impossible case
        return freshCount == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        printGrid(grid1);
        System.out.println("Minutes to rot all oranges: " + orangesRotting(copyGrid(grid1)));
    }

    // Helper to print grid
    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
    // Helper to copy grid (so original is not modified)
    public static int[][] copyGrid(int[][] grid) {
        int[][] copy = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            copy[i] = Arrays.copyOf(grid[i], grid[i].length);
        }
        return copy;
    }
}
