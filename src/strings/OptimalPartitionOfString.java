package strings;

import java.util.*;

/**
 * Optimal Partition of String
 * - 문자열 s가 주어졌을 때, 하나 이상의 서브스트링으로 분할, 각 서브 스프링은 유니크 값이여야 한다.
 * 조건
 *  - 영어 소문자로만 이루어져있다
 * */

public class OptimalPartitionOfString {

    public static void main(String[] args) {
        //var s = "abacaba"; // 4
        var s = "ssssss";

        var result = partitionString(s);
        System.out.println(result);
    }

    /**
     * 시도
     * - Set으로 값을 저장하면서 진행
     * 회고
     * - 성공은 했지만 편법인 것 같은 느낌이 들어 찜찜 함.. 개선 해보는 것도 좋을것 같음.
     * - HashMap의 경우
     * */
    public static int partitionString(String s) {
        var count = 0;
        var used = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (used.contains(c)) {
                count++;
                used.clear();
            }
            used.add(c);
        }

        if (!used.isEmpty()) {
            count++;
        }

        return count;
    }
}
