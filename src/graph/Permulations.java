package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 순열
 * - 서로 다른 정수를 입력 받아 가능한 모든 순열을 리턴하라.
 * 조건
 *  -
 * */

public class Permulations {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 4};
        /*
        * 1, 2, 4
        * 1, 4, 2
        * 2, 1, 4
        * 2, 4, 1
        * 4, 1, 2
        * 4, 2, 1
        *
        * Input: nums = [0,1]
        *  Output: [[0,1],[1,0]]
        * */
        List<List<Integer>> result = new ArrayList<>();
    }

    /**
     * 시도
     * - 순열: 모든 가능한 경우를 나열
     * - 모든 가능한 경우를 나열하려면?
     *  - 앞에 있는 수, 뒤에 있는 수를가지고 가야 함.
     * 풀이
     * -
     * 회고
     * - 드디어 순열 문제..
     * */
}
