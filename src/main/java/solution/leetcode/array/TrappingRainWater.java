package solution.leetcode.array;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrappingRainWater {
    public int trap(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int volume = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int width = i - stack.peek() - 1;
                int level = Math.min(height[i], height[stack.peek()]) - height[top];
                volume += width * level;
            }
            stack.push(i);
        }
        return volume;
    }
}
