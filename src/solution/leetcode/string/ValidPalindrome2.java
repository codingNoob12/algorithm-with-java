package solution.leetcode.string;

public class ValidPalindrome2 {
    public boolean isPalindrome(String s) {
        String filtered_s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed_s = new StringBuilder(filtered_s).reverse().toString();
        return filtered_s.equals(reversed_s);
    }
}
