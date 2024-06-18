package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 전화번호 문자 조합
 * - 2에서 9까지 숫자가 주어졌을 때 전화번호로 조합 가능한 모든 문자 출력
 * 조건
 *  -
 * */

public class LetterCombinationsOfPhoneNumber {

    public static void main(String[] args) {
        var phoneNumbers = new HashMap<Character, List<Character>>(9);
        phoneNumbers.put('1', List.of());
        phoneNumbers.put('2', List.of('a', 'b', 'c'));
        phoneNumbers.put('3', List.of('d', 'e', 'f'));
        phoneNumbers.put('4', List.of('g', 'h', 'i'));
        phoneNumbers.put('5', List.of('j', 'k', 'l'));
        phoneNumbers.put('6', List.of('m', 'n', 'o'));
        phoneNumbers.put('7', List.of('p', 'q', 'r', 's'));
        phoneNumbers.put('8', List.of('t', 'u', 'v'));
        phoneNumbers.put('9', List.of('w', 'x', 'y', 'z'));

        var digits = "";
        var result = new ArrayList<String>();


        dfs(phoneNumbers, result, digits, 0, new StringBuilder());

        System.out.println();
    }

    /**
     * 시도
     * - 전체 문자를 탐색할 수 있는 방법을 찾아야 함.
     * 풀이
     * - buffer의 개수를 이용하고 결과를 마지막에서 담는 방법
     * 회고
     * - 재귀는 아직 어려운 것 같다..
     * - buffer가 공유 될 때 문자는 하나 제거 해주는 지져분한 로직이 있었는데 풀이에서는 새로운 인스턴스를 하나 더 생성 하는 것으로 해결 했다.. 허무..
     * */

    public static void dfs(Map<Character, List<Character>> phoneNumbers, List<String> result, String digits, int index, StringBuilder buffer) {
        /*
        if (digits.length() <= index) {
            return;
        }

        var chars = phoneNumbers.get(digits.charAt(index));
        for (Character word : chars) {
            buffer.append(word);

            dfs(phoneNumbers, result, digits, index + 1, buffer);

            // 마지막 글자라면 결과에 저장
            if (index == digits.length() - 1) {
                result.add(buffer.toString());
                buffer.deleteCharAt(buffer.length() - 1);
            } else if (index == 0) {
                buffer = new StringBuilder();
            } else {
                buffer.deleteCharAt(buffer.length() - 1);
            }
        }
         */

        // 마지막까지 탐색 했다면
        if (buffer.length() == digits.length()) {
            result.add(buffer.toString());
            return;
        }

        var chars = phoneNumbers.get(digits.charAt(index));
        for (Character word : chars) {
            dfs(phoneNumbers, result, digits, index + 1, new StringBuilder(buffer).append(word));
        }
    }
}
