package solution.leetcode.string;

public class LongestPalindromicSubstring {
    private int left;
    private int maxLen;

    private void expendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (k - j - 1 > maxLen) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
    
    public String longestPalindrome(String s) {
        int len = s.length();
        
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            expendPalindrome(s, i, i + 1);
            expendPalindrome(s, i, i + 2);
        }
        return s.substring(left, left + maxLen);
    }
}
