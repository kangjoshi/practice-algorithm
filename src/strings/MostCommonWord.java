package strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 가장 흔한 단어
 * - 금지된 단어를 제외하고 가장 흔한 단어를 출력하라.
 * 조건
 *  - 대소문자 구분하지 않으며, 구두점(마침표, 쉼표 등) 또한 무시한다.
 * */

public class MostCommonWord {

    public static void main(String[] args) {

        var paragraph = "Ross hit a ball, the hi BALL flew far after it was hit.";
        var banned = new String[]{"hit"};

        var word = mostCommonWord(paragraph, banned);

        System.out.println(word);
    }

    /**
     * 시도
     * - 문장을 " "으로 나뉘어 단어집(?)을 만들고 banned에 포함되지 않는 단어를 카운트하여 가장 많이 나온 단어를 출력
     * 풀이
     * -
     * */

    public static String mostCommonWord(String paragraph, String[] banned) {
        var bannedList = List.of(banned);
        var wordMap = new HashMap<String, Integer>();

        String[] words = clearMarks(paragraph).split(" ");
        for (String word : words) {
            if (bannedList.contains(word)) {
                continue;
            }

            var key = word.toLowerCase();
            if (wordMap.containsKey(key)) {
                wordMap.computeIfPresent(key, (k, v) -> v + 1);
            } else {
                wordMap.put(key, 1);
            }
        }

        return wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static String clearMarks(String paragraph) {
        return paragraph.replaceAll("[.,]", "");
    }
}
