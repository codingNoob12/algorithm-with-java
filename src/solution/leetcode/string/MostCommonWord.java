package solution.leetcode.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> counter = new HashMap<>();
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        for (String word : words) {
            if (!bannedWords.contains(word)) {
                counter.put(word, counter.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(counter.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
