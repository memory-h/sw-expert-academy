package d3;

import java.io.*;

/**
 * 13229. 일요일 D3
 */
public class Solution_13229 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int idx = 1;

        while (t-- > 0) {
            String input = br.readLine();
            int value = 0;

            switch (input) {
                case "MON":
                    value = 1;
                    break;

                case "TUE":
                    value = 2;
                    break;

                case "WED":
                    value = 3;
                    break;

                case "THU":
                    value = 4;
                    break;

                case "FRI":
                    value = 5;
                    break;

                case "SAT":
                    value = 6;
                    break;
            }

            sb.append("#").append(idx++).append(" ").append(7 - value).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}