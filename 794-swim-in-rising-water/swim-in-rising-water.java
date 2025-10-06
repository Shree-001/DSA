import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        
        for (int t = 0; t < n * n; t++) {
            if (canReachDestination(grid, t)) {
                return t;
            }
        }
        
        return -1;
    }

    private boolean canReachDestination(int[][] grid, int t) {
        int n = grid.length;

        if (grid[0][0] > t) {
            return false;
        }

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            if (r == n - 1 && c == n - 1) {
                return true;
            }

            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];

                if (newR >= 0 && newR < n && newC >= 0 && newC < n && !visited[newR][newC] && grid[newR][newC] <= t) {
                    visited[newR][newC] = true;
                    queue.offer(new int[]{newR, newC});
                }
            }
        }
        
        return false;
    }
}