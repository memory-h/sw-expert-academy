package d1;

import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 2072. 홀수만 더하기 D1
 */
public class D1_2072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int idx = 1;

        for(int test_case = 1; test_case <= t; test_case++) {
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                int value = sc.nextInt();

                if (value % 2 != 0) {
                    sum += value;
                }
            }

            System.out.println("#" + idx++ + " " + sum);
        }
    }

}