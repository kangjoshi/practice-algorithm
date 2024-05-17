package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 두 수의 덧셈
 * - 역순으로 저장된 연결 리스트의 숫자를 더하라
 * 조건
 *  -
 * */

public class AddTwoNumbers {

    public static void main(String[] args) {
        // (2 -> 4 -> 3) + (5 -> 6 -> 2) = 7 -> 0 -> 6
        // 설명 342 + 265 = 607

        var numbers1 = new LinkedList<>(List.of(2, 4, 3));
        var numbers2 = new LinkedList<>(List.of(5, 6, 2));

        var result = sum(numbers1, numbers2);

        result.forEach(System.out::print);
    }

    /**
     * 시도
     * - 뒤집혀 있는 순서대로 계산, 계산에서 10을 초과한다면 다음 계산 대상에게 +1
     * 풀이
     * -
     * */
    public static List<Integer> sum(List<Integer> numbers1, List<Integer> numbers2) {
        List<Integer> result = new ArrayList<>();

        var plus = 0;
        for (int i = 0; i < numbers1.size(); i++) {
            var sum = numbers1.get(i) + numbers2.get(i);
            result.add((sum % 10) + plus);
            if (sum >= 10) {
                plus = 1;
            } else {
                plus = 0;
            }
        }
        return result.reversed();
    }
}
