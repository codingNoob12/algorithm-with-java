package solution.leetcode.string;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start < end) {
            swap(s, start, end);
            start++;
            end--;
        }
    }

    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
