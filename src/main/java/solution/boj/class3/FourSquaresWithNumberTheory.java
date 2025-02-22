package solution.boj.class3;

import java.util.Scanner;

public class FourSquaresWithNumberTheory {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            // 1. n이 제곱수인지 확인
            if (isPerfectSquare(n)) {
                System.out.println(1);
                return;
            }

            // 2. n이 두 제곱수의 합으로 표현 가능한지 확인
            for (int i = 1; i * i < n; i++) {
                if (isPerfectSquare(n - i * i)) {
                    System.out.println(2);
                    return;
                }
            }

            // 3. Legendre의 세 제곱 정리 조건 검사
            // - n이 4^a*(8b+7) 꼴이면 세 제곱으로 표현 불가
            while (n % 4 == 0) {
                n /= 4;
            }
            if (n % 8 == 7) {
                System.out.println(4);
                return;
            }
        }
        System.out.println(3);
    }

    private static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}
