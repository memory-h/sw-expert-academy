package d3;

import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 20934. 방울 마술 D3
 */
public class Solution_20934 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        int idx = 1;

        while (t-- > 0) {
            char[] c = new char[3];

            String s = sc.next();
            int initDrop = 0;

            for (int i = 0; i < s.length(); i++) {
                c[i] = s.charAt(i);

                if (c[i] == 'o') {
                    // 방울 위치 저장
                    initDrop = i;
                }
            }

            int k = sc.nextInt();

            if (k == 0) { // 방울이 울리지 않은 경우
                sb.append("#").append(idx++).append(" ").append(initDrop).append("\n");
            } else {
                int result;

                // 방울이 왼쪽 또는 오른쪽에 있는 경우
                if (initDrop == 0 || initDrop == 2) {
                    if (k % 2 != 0) {
                        result = 1;
                    } else {
                        result = 0;
                    }
                } else { // 방울이 가운데에 있는 경우
                    if (k % 2 != 0) {
                        result = 0;
                    } else {
                        result = 1;
                    }
                }

                sb.append("#").append(idx++).append(" ").append(result).append("\n");
            }
        }

        System.out.println(sb);
    }
}