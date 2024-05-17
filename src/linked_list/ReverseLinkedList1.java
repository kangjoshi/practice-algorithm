package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 역순 연결리스트
 * - 연결 리스트를 뒤집어라
 * 조건
 *  -
 * */

public class ReverseLinkedList1 {

    public static void main(String[] args) {
        var numbers = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6));
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6

        var reversed = reverse(numbers);

        reversed.forEach(System.out::println);
    }

    /**
     * 시도
     * - pollLast 이용?
     * 풀이
     * -
     * */
    public static List<Integer> reverse(LinkedList<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers.size());

        while (!numbers.isEmpty()) {
            result.add(numbers.pollLast());
        }

        return result;
    }
}
