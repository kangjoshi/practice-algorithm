package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 부분집합
 * - 모든 부분 집합을 리턴
 * 조건
 *  -
 * */

public class Subsets {

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 4};
        /**
         * [], [1], [2], [4], [1, 2], [1, 4], [2, 4], [1, 2, 4]
         * [], [1], [1, 2], [1, 2, 4], [1, 4], [2], [2, 4], [4]
         * */

        var result = new ArrayList<List<Integer>>();

        dfs(result, nums, 0, new ArrayDeque<>());
        System.out.println();

    }

    /**
     * 시도
     * - 탐색하면서 결과를 계속해서 담기
     * 풀이
     * -
     * */
    public static void dfs(List<List<Integer>> result, int[] nums, int index, ArrayDeque<Integer> path) {
        result.add(new ArrayList<>(path));

        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(result, nums, i + 1, path);
            path.removeLast();
        }
    }

}
