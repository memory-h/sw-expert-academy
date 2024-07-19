package d3;

import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 20955. XY 문자열 1 D3
 */
public class D3_20955 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int idx = 1;

        while (t --> 0) {
            String s = sc.next();
            String e = sc.next();

            while (true) {
                if (s.equals(e)) {
                    System.out.println("#" + idx++ + " Yes");
                    break;
                }

                if (s.length() > e.length()) {
                    System.out.println("#" + idx++ + " No");
                    break;
                }

                if (e.charAt(e.length() - 1) == 'X') {
                    e = e.substring(0, e.length() - 1);
                } else {
                    e = e.substring(0, e.length() - 1);

                    StringBuilder sb = new StringBuilder(e);
                    e = sb.reverse().toString();
                }
            }
        }
    }

}