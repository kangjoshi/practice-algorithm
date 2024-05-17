package linked_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 투 정렬 리스트의 병합
 * - 정렬되어 있는 두 연결 리스트를 합쳐라
 * 조건
 *  -
 * */

public class MergeTwoSortedList {

    public static void main(String[] args) {
        // 1 -> 2 -> 5
        // 1 -> 3 -> 4
        // = 1 -> 1 -> 2 -> 3 -> 4 -> 5

        var numbers1 = new LinkedList<>(List.of(1, 2, 5));
        var numbers2 = new LinkedList<>(List.of(1, 3, 4));

        var merged = merge(numbers1, numbers2);
        merged.forEach(number -> System.out.println(number + " "));
    }

    /**
     * 시도
     * - 그냥 합친 후 정렬? 이미 정렬이 되어 있는게 문제이므로 이 방법은 제외 해야 될 듯.
     * - 두 배열의 값을 비교 하면서 낮은 순서대로 꺼내기, 만약 둘중 하나의 배열이 먼저 끝나면 마지막 머지 리스트에 남은 배열의 값을 모두 add
     * 풀이
     * -
     * 회고
     * - 코드가 맘에 들지 않은데..
     * */
    public static List<Integer> merge(LinkedList<Integer> numbers1, LinkedList<Integer> numbers2) {
        var merged = new LinkedList<Integer>();

        while (!numbers1.isEmpty() && !numbers2.isEmpty()) {
            if (numbers1.getFirst() < numbers2.getFirst()) {
                merged.add(numbers1.poll());
            } else {
                merged.add(numbers2.poll());
            }
        }

        merged.addAll(numbers1);
        merged.addAll(numbers2);
        return merged;
    }
}
