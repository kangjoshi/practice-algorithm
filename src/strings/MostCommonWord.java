package strings;

import java.util.*;
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
     * - 문장을 " "으로 나뉘어 단어집(?)을 만들고 banned에 포함되지 않는 단어를 카운트하여 정렬 후 앞에꺼 리턴
     * 풀이
     * - 정규식 \W == 문자열이 아닌 것, \w == 문자열인 것.
     * 회고
     * - 저런 좋은 정규식이...
     * - 가장 큰 값을 찾는게 목적이므로 max를 쓰면 되었는데.. 굳이 정렬하는 코드를 고민 했음.
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
            wordMap.put(key, wordMap.getOrDefault(key, 0) + 1);
        }

        return Collections.max(wordMap.entrySet(), Map.Entry.comparingByValue()).getKey();

    }

    public static String clearMarks(String paragraph) {
        return paragraph.replaceAll("\\W+", " ");
    }
}
