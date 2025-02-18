package solution.boj.class2;

import java.util.Scanner;

public class WelcomeKit {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] sizes = new int[6];
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = scanner.nextInt();
        }
        int t = scanner.nextInt(), p = scanner.nextInt();

        int pack = 0;
        for (int i = 0; i < sizes.length; i++) {
            pack += sizes[i] / t + (sizes[i] % t != 0 ? 1 : 0);
        }
        System.out.println(pack);
        System.out.println(n / p + " " + n % p);
    }
}
