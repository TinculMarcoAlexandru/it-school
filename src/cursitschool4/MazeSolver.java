package cursitschool4;

public class MazeSolver {
    static char[][] maze = {
            {'S', '1', '0', '1'},
            {'0', '1', '0', '1'},
            {'0', '1', '0', '1'},
            {'1', '0', '0', 'E'}
    };

    static int rows = maze.length;
    static int cols = maze[0].length;
    static boolean[][] visited = new boolean[rows][cols];

    static int[] dx = {-1, 1, 0, 0}; // Up, Down, Left, Right
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        int startX = -1, startY = -1;

        // Find the start position
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maze[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
            }
        }

        if (dfs(startX, startY)) {
            printMaze();
        } else {
            System.out.println("No solution found.");
        }
    }

    static boolean dfs(int x, int y) {
        if (!isValid(x, y) || visited[x][y] || maze[x][y] == '1') return false;

        if (maze[x][y] == 'E') return true;

        visited[x][y] = true;

        // Don't overwrite 'S'
        if (maze[x][y] != 'S') {
            maze[x][y] = '*';
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (dfs(nx, ny)) return true;
        }

        // Backtrack
        if (maze[x][y] != 'S') {
            maze[x][y] = '0';
        }

        return false;
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    static void printMaze() {
        for (char[] row : maze) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println("No solution found");
        }
    }
}

