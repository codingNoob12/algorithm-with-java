package solution.boj.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FourSquares {

    public static void main(String[] args) throws IOException {
        final int INVALID = Integer.MAX_VALUE;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INVALID);

        for (int i = 0; i * i < dp.length; i++) {
            int index = i * i;
            dp[index] = 1;
            for (int j = 1; j <= i && i * i + j * j < dp.length; j++) {
                index = i * i + j * j;
                dp[index] = Math.min(dp[index], 2);
                for (int k = 1; k <= j && i * i + j * j + k * k < dp.length; k++) {
                    index = i * i + j * j + k * k;
                    dp[index] = Math.min(dp[index], 3);
                    for (int l = 1; l <= k && i * i + j * j + k * k + l * l < dp.length; l++) {
                        index = i * i + j * j + k * k + l * l;
                        dp[index] = Math.min(dp[index], 4);
                    }
                }
            }
        }

        System.out.println(dp[n]);
    }
}
