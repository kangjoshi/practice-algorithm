package hashtable;

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

        var charArray = input.toCharArray();
        var set = new HashSet<Character>(charArray.length);

        var maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < charArray.length; i++) {
            if (set.contains(charArray[i])) {
                maxLength = Math.max(set.size(), maxLength);
                set.clear();
            }
            set.add(charArray[i]);
        }
        maxLength = Math.max(maxLength, set.size());
        System.out.println(maxLength);
    }

    /**
     * 시도
     * - 순회하면서 한글자씩 set에 입력, set에 존재하는 문자열을 만나면 해당 사이즈를 길이로 기록, 사이즈를 비교하며 가장 큰 길이를 반환
     * 풀이
     * -
     * 회고
     * - 정답 틀림.
     * */
}
