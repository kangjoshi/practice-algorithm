package hashtable;

import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * 상위 k 빈도 엘리먼트
 * - 빈도순으로 k개의 엘리먼트를 추출
 * 조건
 *  -
 * */

public class TopKFrequentElements {

    public static void main(String[] args) {
        var numbers = List.of(1, 1, 1, 3, 3, 3, 2, 2, 2, 2, 3 ,4);
        var k = 2;

        var map = new HashMap<Integer, Integer>();
        for (var number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        var queue = new PriorityQueue<int[]>((o1, o2) -> o2[1] - o1[1]);
        for (var key : map.keySet()) {
            queue.add(new int[]{key, map.get(key)});
        }

        var result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[0];
        }

        System.out.println(result);
    }

    /**
     * 시도
     * - 순회하면서 map에 빈도 기록, 정렬 후 k 만큼 출력
     * 풀이
     * - 정렬보다 우선 순위 큐 사용하면 좀더 빨리 질 수 있음.
     * 회고
     * - 속도 느림. 개선 필요
     * - 우선 순위 큐는 처음 써보는데 실무에서도 잘 활용 될 수 있을것 같다.
     * */
}
