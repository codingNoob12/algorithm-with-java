package solution.boj.class3;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class HunnaegiNeedsFriend {
    
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static final char WALL = 'X';
    private static final char PERSON = 'P';
    private static final String FAIL_MESSAGE = "TT";
    private static int n, m, x, y;

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt(); //행
            m = scanner.nextInt(); //열
            char[][] campus = new char[n][m];
            for (int i = 0; i < n; i++) {
                String buffer = scanner.next();
                for (int j = 0; j < m; j++) {
                    campus[i][j] = buffer.charAt(j);
                    if (campus[i][j] == 'I') {
                        x = i;
                        y = j;
                    }
                }
            }

            int count = bfs(campus);
            System.out.println(count == 0 ? FAIL_MESSAGE : count);
        }
    }

    private static int bfs(char[][] campus) {
        int count = 0;
        
        Queue<Position> queue = new ArrayDeque<>();
        queue.add(new Position(x, y));

        boolean[][] visited = new boolean[campus.length][campus[0].length];
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            if (campus[current.x][current.y] == PERSON) {
                count++;
            }

            for (int i = 0; i < dx.length; i++) {
                Position next = new Position(current.x + dx[i], current.y + dy[i]);
                if (next.x < 0 || next.x >= n || next.y < 0 || next.y >= m) {
                    continue;
                }
                if (campus[next.x][next.y] == WALL || visited[next.x][next.y]) {
                    continue;
                }
                queue.add(next);
                visited[next.x][next.y] = true;
            }
        }

        return count;
    }

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
