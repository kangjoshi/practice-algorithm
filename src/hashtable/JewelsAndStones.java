package hashtable;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 보석과 돌
 * - J는 보석이며 S는 갖고 있는 돌이다. 돌에는 보석이 몇 개나 있을까
 * 조건
 *  - 대소문자는 구분
 * */

public class JewelsAndStones {

    public static void main(String[] args) {
        var j = "aA";
        var s = "aAAbbbb";

        var set = new HashSet<Character>();
        for (char c : j.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }

        System.out.println(count);
    }

    /**
     * 시도
     * - 보석의 종류를 Set에 저장
     * - 돌을 순회하며 보석 여부를 판단하여 숫자 증가
     * 풀이
     * -
     * 회고
     * -
     * */
}
