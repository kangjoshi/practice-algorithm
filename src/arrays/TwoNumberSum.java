package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 두 수의 합
 * - 덧셈하여 타깃을 만들 수 있는 배열의 두 숫자 인덱스를 리턴
 * 조건
 *  -
 * */

public class TwoNumberSum {

    public static void main(String[] args) {
        var numbers = new int[]{2, 6, 11, 2, 15, 6, 1, 7};
        var target = 8;

        var indexes = sum(numbers, target);

        System.out.println(indexes);
    }

    /**
     * 시도
     * - 순회하며 더하기
     * - 본인(?)이 이미 조건 보다 크거나 같다면 순회하지 않음
     * 풀이
     * -
     * 회고
     * - 모든 조합을 찾는것이 아니였음. 문제를 더 꼼꼼하게 읽는 방식이 좋을 듯?
     * */

    public static List<String> sum(int[] numbers, int target) {
        var indexes = new ArrayList<String>();

        for (var i = 0; i < numbers.length; i++) {
            if (numbers[i] >= target) {
                continue;
            }

            for(var j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    indexes.add("[" + i + ", " + j + "]");
                }
            }
        }

        return indexes;
    }
}
