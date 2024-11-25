package solution.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        for (String log : logs) {
            if (isLetterLog(log)) {
                letterLogs.add(log);
            } else {
                digitLogs.add(log);
            }
        }

        letterLogs.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            if (!s1x[1].equals(s2x[1])) {
                return s1x[1].compareTo(s2x[1]);
            }
            return s1x[0].compareTo(s2x[0]);
        });

        letterLogs.addAll(digitLogs);
        return letterLogs.toArray(new String[0]);
    }

    private boolean isLetterLog(String log) {
        return !Character.isDigit(log.split(" ", 2)[1].charAt(0));
    }
}
