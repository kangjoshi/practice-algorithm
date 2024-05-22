package hashtable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        var rank = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .toList();

        for (int i = 0; i < k; i++) {
            System.out.println(rank.get(i));
        }
        // [1, 2]
    }

    /**
     * 시도
     * - 순회하면서 map에 빈도 기록, 정렬 후 k 만큼 출력
     * 풀이
     * -
     * */
}
