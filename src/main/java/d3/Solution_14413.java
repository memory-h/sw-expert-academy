package d3;

import java.io.*;
import java.util.*;

/**
 * 14413. 격자판 칠하기 D3
 */
public class Solution_14413 {

    static int n, m;
    static char[][] graph;
    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            graph = new char[n][m];
            visited = new boolean[n][m];

            for (int i = 0; i < n; i++) {
                String input = br.readLine();

                for (int j = 0; j < m; j++) {
                    graph[i][j] = input.charAt(j);
                }
            }

            sb.append('#').append(idx++).append(checkGrid() ? " possible" : " impossible").append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
    }

    private static boolean checkGrid() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 방문하지 않았고, 검은색 또는 흰색인 경우
                if (!visited[i][j] && graph[i][j] != '?') {
                    if (!dfs(i, j, graph[i][j])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean dfs(int x, int y, char color) {
        if (visited[x][y]) {
            return true;
        }

        visited[x][y] = true;
        graph[x][y] = color;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위를 벗어난 경우
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                continue;
            }

            char nextColor = (color == '#') ? '.' : '#';

            // 흰색 또는 검은색으로 칠해도 되는 경우
            if (graph[nx][ny] == '?') {
                if (!dfs(nx, ny, nextColor)) {
                    return false;
                }
            } else if (graph[nx][ny] == color) { // 현재 색깔과 이동했을 때 색깔이 같은 경우
                return false;
            }
        }

        return true;
    }

}