package algorithm;

import java.util.*;

/**
 * 너비 우선 탐색
 * - 큐를 이용, 재귀로는 구현 불가
 * */
public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList(5));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList(6, 7));
        graph.put(6, Arrays.asList());
        graph.put(7, Arrays.asList(3));

        System.out.println(queueBFS(graph, 1));
    }

    public static List<Integer> queueBFS(Map<Integer, List<Integer>> graph, int v) {
        // 결과 저장
        var discovered = new ArrayList<Integer>();
        // 시작 노드 삽입
        discovered.add(v);
        var queue = new LinkedList<Integer>();
        // 시작 노드 삽입
        queue.add(v);
        // 큐가 모두 비워질 때 까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 추출
            var n = queue.poll();

            // 방문한 노드가 아니라면 추가하고 주변 노드 모두 큐에 삽입
            for (int w : graph.get(n)) {
                if (!discovered.contains(w)) {
                    discovered.add(w);
                    queue.add(w);
                }
            }
        }
        return discovered;
    }


}
