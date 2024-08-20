package d3;

import java.io.*;

/**
 * 13732. 정사각형 판정 D3
 */
public class Solution_13732 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            char[][] grid = new char[n][n];
            int minRow = n, minCol = n, maxRow = -1, maxCol = -1;

            for (int i = 0; i < n; i++) {
                String input = br.readLine();

                for (int j = 0; j < n; j++) {
                    grid[i][j] = input.charAt(j);

                    if (grid[i][j] == '#') {
                        if (i < minRow) minRow = i;
                        if (j < minCol) minCol = j;
                        if (i > maxRow) maxRow = i;
                        if (j > maxCol) maxCol = j;
                    }
                }
            }

            boolean isSquare = validateSquareShape(minRow, maxRow, minCol, maxCol, grid);

            if (maxRow - minRow != maxCol - minCol) {
                isSquare = false;
            }

            sb.append("#").append(idx++);

            if (isSquare) {
                sb.append(" yes\n");
            } else {
                sb.append(" no\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean validateSquareShape(int minRow, int maxRow, int minCol, int maxCol, char[][] grid) {
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                if (grid[i][j] != '#') {
                    return false;
                }
            }
        }

        return true;
    }

}