package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 조합
 * - 전체 수 n을 입력 받아 k개의 조합을 리턴
 * 조건
 *  - 응답의 정렬은 상관 없음
 * */

public class Combinations {

    public static void main(String[] args) {

        var n = 5;
        var k = 3;

        var result = combine(n ,k);

        System.out.println(result);
    }

    /**
     * 시도
     * - 1 ~ n까지 k개 조합
     * 풀이
     * -
     * */
    public static List<List<Integer>> combine(int n, int k) {
        var result = new ArrayList<List<Integer>>();

        dfs(result, new LinkedList<>(), n, 1, k);

        return result;
    }

    /**
     * result: 결과
     * elements: 탐색한 노드 값 저장
     * n: 전체 수
     * start: 시작 값
     * k: 조합 수
     * */

    public static void dfs(List<List<Integer>> result, LinkedList<Integer> elements, int n, int start, int k) {
        if (k == 0) {
            result.add(elements.stream().toList());
            return;
        }

        // start 조합은 순서를 보지 않으므로, 이전 엘리먼트 보다 이후 엘리먼트의 값을 항상 더 크게 구성 (1, 2, 3과 3, 2, 1은 동일한 조합)
        for (int i = start; i <= n ; i++) {
            elements.add(i);
            dfs(result, elements, n, i + 1, k - 1);
            elements.removeLast();
        }
    }

}
