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

    public void dfs(List<List<Integer>> results, List<Integer> prevElements, List<Integer> elements) {
        // nextElements가 없다면 (리프 노드에 도달 했다면) 결과에 추가
        if (elements.isEmpty()) {
            results.add(prevElements.stream().toList());
        }

        // 전달 받은 엘리먼트를 모두 탐색
        for (Integer e : elements) {
            // 전달 받은 엘리먼트에서 현재 엘리먼트를 제외하고 구성
            var nextElements = new ArrayList<>(elements);
            nextElements.remove(e);

            // 기존 값에 현재 엘리먼트 추가
            prevElements.add(e);

            dfs(results, prevElements, nextElements);
            // 돌아온 이후에는 preElements에서 현재 엘리먼트 삭제
            prevElements.remove(e);
        }

    }

}
