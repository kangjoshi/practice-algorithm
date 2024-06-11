package algorithm;

import java.util.*;

/**
 * 깊이 우선 탐색
 *  - 스택 또는 재귀로 구현
 *  % 백트래킹
 *  - 해결책에 대한 후보를 구축해 나가다 가능성이 없다고 판단되는 즉시 후보를 포기해 정답을 찾아가는 알고리즘
 *   - 브루트 포스 방법과 비슷하지만, 가망성이 없는 후보는 즉시 포기하는 점에서 트리의 불필요한 부분은 버릴수 있음.(트리 가지치기)
 *
 *
 * */
public class DepthFirstSearch {

    public static void main(String[] args) {
        // key = node, value = 인접한 노드
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList(5));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList(6, 7));
        graph.put(6, Arrays.asList());
        graph.put(7, Arrays.asList(3));

        recursiveDFS(graph, 1, new ArrayList<>());

        stackDFS(graph, 1);
    }

    // 재귀를 이용한 깊이 우선 탐색
    public static List<Integer> recursiveDFS(Map<Integer, List<Integer>> graph, int v, List<Integer> discovered) {
        // 현재 노드 저장
        discovered.add(v);

        // 인접한 노드 탐색
        for (Integer w : graph.get(v)) {
            // 방문 하지 않은 노드라면 탐색 진행
            if (!discovered.contains(w)) {
                discovered = recursiveDFS(graph, w, discovered);
            }
        }
        return discovered;
    }

    // 스택을 이용한 깊이 우선 탐색
    // 스택의 특성 때문에 재귀를 이용한 깊이 우선 탐색과 탐색 방향은 약간 차이가 있음.
    public static List<Integer> stackDFS(Map<Integer, List<Integer>> graph, int v) {
        // 결과 저장
        var discovered = new ArrayList<Integer>();
        var stack = new ArrayDeque<Integer>();

        // 현재 노드를 스택에 삽입
        stack.push(v);
        // 스팩이 모두 비워질 때까지 반복
        while (!stack.isEmpty()) {
            // 스택에서 추출
            v = stack.pop();

            // 방문 하지 않은 노드라면 탐색 진행
            if (!discovered.contains(v)) {
                discovered.add(v);
                // 인접 노드를 모두 스택에 삽입
                for (Integer w : graph.get(v)) {
                    stack.push(w);
                }
            }
        }
        return discovered;
    }

}
