import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        
        paragraph = paragraph.toLowerCase();

        
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        
        String[] words = paragraph.split("[!?',;. ]+");

        
        Map<String, Integer> map = new HashMap<>();

        String result = "";
        int maxCount = 0;

        for (String word : words) {

            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }

            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > maxCount) {
                maxCount = map.get(word);
                result = word;
            }
        }

        return result;
    }
}