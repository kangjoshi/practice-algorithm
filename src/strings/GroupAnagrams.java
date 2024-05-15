package strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 그룹 애너그램
 * - 문자열 배열을 받아 애너그램 단위로 그룹핑
 * 조건
 *  -
 * */

public class GroupAnagrams {

    public static void main(String[] args) {
       var inputs = new String[]{
               "eat", "tea", "tan", "ate", "ant", "cat"
       };

        var grouping = grouping(inputs);
        grouping.forEach(group -> System.out.println(String.join(",", group)));
    }

    /**
     * 시도
     * - 문자열을 정렬하여 비교하여 애너그램 여부를 판단
     * 풀이
     * - 동일
     * 회고
     * -
     * */
    public static Collection<List<String>> grouping(String[] inputs) {
        var wordMap = new HashMap<String, List<String>>();

        for (String input : inputs) {
            var charArray = input.toCharArray();
            Arrays.sort(charArray);
            var key = String.valueOf(charArray);

            if (!wordMap.containsKey(key)) {
                wordMap.put(key, new ArrayList<>());
            }

            wordMap.get(key).add(input);
        }
        return wordMap.values();
    }


}
