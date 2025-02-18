package solution.boj.class2;

import java.util.Scanner;

public class FizzBuzz {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        int counter = 4;
        do {
            s = scanner.nextLine();
            counter--;
        } while (!isInteger(s));
        int target = Integer.parseInt(s) + counter;

        if (target % 3 == 0 && target % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (target % 3 == 0) {
            System.out.println("Fizz");
        } else if (target % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(target);
        }
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
