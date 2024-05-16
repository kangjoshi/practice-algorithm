package linked_list;

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

        var numbers1 = List.of(1, 2, 5);
        var numbers2 = List.of(1, 3, 4);

        var merged = merge(numbers1, numbers2);
        merged.forEach(number -> System.out.println(number + " "));
    }

    /**
     * 시도
     * - 숫자 비교
     * 풀이
     * -
     * */
    public static List<Integer> merge(List<Integer> numbers1, List<Integer> numbers2) {
        var list1 = new LinkedList<>(numbers1);
        var list2 = new LinkedList<>(numbers2);

        while (list1.isEmpty() && list2.isEmpty()) {

        }



        return null;
    }
}
