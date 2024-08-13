package d3;

import java.io.*;

/**
 * 15612. 체스판 위의 룩 배치 D3
 */
public class Solution_15612 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            char[][] chess = new char[8][8];
            int rookCount = 0;

            for (int i = 0; i < 8; i++) {
                String input = br.readLine();

                for (int j = 0; j < 8; j++) {
                    chess[i][j] = input.charAt(j);

                    if (chess[i][j] == 'O') {
                        rookCount++;
                    }
                }
            }

            boolean isCondition;

            // 체스판 위에 룩의 개수가 8개가 아닌 경우
            if (rookCount != 8) {
                isCondition = false;
            } else {
                isCondition = isRookConfigurationValid(chess);
            }

            sb.append("#").append(idx++);

            if (isCondition) {
                sb.append(" yes\n");
            } else {
                sb.append(" no\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isRookConfigurationValid(char[][] chess) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chess[i][j] == 'O') {
                    if (isRookExist(chess, i, j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    // 해당 위치를 기준으로 행과 열을 탐색하여 또 다른 룩이 있는지 확인하는 메서드
    private static boolean isRookExist(char[][] board, int x, int y) {
        for (int i = 0; i < 8; i++) {
            if (board[x][i] == 'O') {
                if (y == i) {
                    continue;
                }

                return true;
            }

            if (board[i][y] == 'O') {
                if (x == i) {
                    continue;
                }

                return true;
            }
        }

        return false;
    }

}