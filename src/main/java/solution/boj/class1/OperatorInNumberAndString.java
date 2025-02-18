package solution.boj.class1;

import java.util.Scanner;

public class OperatorInNumberAndString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b - c);
        int result = Integer.valueOf("" + a + b) - c;
        System.out.println(result);
    }
}
