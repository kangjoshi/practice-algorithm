package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 조합의 합
 * - 숫자 집한 candidates를 조합하여 합이 target이 되는 엘리먼트를 나열하라, 각 숫자는 중보으로 나열 가능
 * 조건
 *  -
 * */

public class CombinationSum {

    public static void main(String[] args) {
        var candidates = new int[]{2, 3, 5, 8};
        var target = 8;

        var result = new ArrayList<List<Integer>>();

        dfs(result, candidates, target, 0, new ArrayDeque<>());

        System.out.println();

        // 조합을 할 때 중복이 가능하다는게 중요할 것 같음.
        // target 보다 값이 작다면 계속해서 본인을 탐색을 계속해서 진행, target과 값이 동일 해진다면 결과에 담고, 커진다면 결과에 담지 않고 종료
    }

    /**
     * 시도
     * - 조합을 할 때 중복이 가능하도록
     * - target 보다 값이 작다면 계속해서 본인을 탐색, target과 값이 동일 해진다면 결과에 담고, 커진다면 결과에 담지 않고 종료
     * 풀이
     * -
     * */
    public static void dfs(List<List<Integer>> result, int[] candidates, int target, int i, Deque<Integer> elements) {
        // target이 -가 된다면 결과가 커진 것이므로 종료
        if (target < 0) {
            return;
        // target이 0이 된다면 지금까지 탐색한 결과 담기
        } else if (target == 0) {
            result.add(new ArrayList<>(elements));
            return;
        }

        // 첫 엘리먼트 부터 탐색 시작
        for (int j = i; j < candidates.length; j++) {
            elements.add(candidates[j]);

            // target - 지금 탐색 중인 값
            dfs(result, candidates, target - candidates[j], j, elements);
            elements.removeLast();
        }

    }

}
