package graph;

import java.util.ArrayList;
import java.util.Arrays;
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

        dfs(result, new ArrayList<>(), Arrays.stream(numbers).boxed().toList());

        System.out.println();

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
     * - 이해 하는데 어렵다...
     * */

    public static void dfs(List<List<Integer>> results, List<Integer> prevElements, List<Integer> elements) {
        // nextElements가 없다면 == 리프 노드에 도달 했다면
        if (elements.isEmpty()) {
            results.add(prevElements.stream().toList()); // 지나온 노드들을 결과에 추가
        }

        // 남은 모든 노드를 탐색
        for (Integer e : elements) {
            // 전달 받은 엘리먼트에서 현재 엘리먼트 제외 next Elements 새로 구성
            var nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            // prevElements에 현재 값 추가
            prevElements.add(e);
            dfs(results, prevElements, nextElements);
            // 돌아온 이후 prevElements에서 현재 값 삭제
            prevElements.remove(e);
        }
    }

}
