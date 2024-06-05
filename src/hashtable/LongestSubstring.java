package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 중복 문자 없는 가장 긴 부분 문자열
 * - 중복 문자가 없는 가장 긴 부분 문자열의 길이를 리턴
 * 조건
 *  -
 * */

public class LongestSubstring {

    public static void main(String[] args) {
        var input = "dvdf"; // abc 3
        // abcabcabaa
        // dvdf

        var left = 0;
        var right = 0;
        var maxLength = 0;
        var used = new HashMap<Character, Integer>(input.length());

        for (char c : input.toCharArray()) {
            // 중복 값이 있다면 값의 위치에서 한칸 이동
            if (used.containsKey(c) && left <= used.get(c)) {
                left = used.get(c) + 1;
            // 등장하지 않았던 문자라면 maxLength를 업데이트
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            used.put(c, right);
            right++;
        }

        System.out.println(maxLength);
    }

    /**
     * 시도
     *
     * 풀이
     * - 슬라이딩 윈도우
     * 회고
     * - 풀이 최종 결과 틀린 결과 였음.
     * - 슬라이딩 윈도우 처음 들어 보는데 이것도 흡수 하자!!..
     * */
}
