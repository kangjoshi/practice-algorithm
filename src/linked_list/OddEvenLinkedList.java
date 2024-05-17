package linked_list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 홀짝 연결리스트
 * - 연결 리스트를 홀수 번째 노드 다음에 짝수 번째 노드가 오도록 재구성하라. 공간 복잡도 O(1), 시간 복잡도 O(n)에 풀이하라
 * 조건
 *  -
 * */

public class OddEvenLinkedList {

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 1 -> 3 -> 5 -> 2 -> 4 -> 6
        var numbers = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6));

        var result = oddEven(numbers);

        result.forEach(System.out::print);
    }

    /**
     * 시도
     * - 홀짝 판단 %2하여 나머지 여부로 확인
     * - 공간 복잡도 O(1)은 신규 배열 생성 없이, 시간 복잡도 O(n)은 중첩된 for문 없이 해결.
     * 풀이
     * -
     * */
    public static List<Integer> oddEven(LinkedList<Integer> numbers) {
        // 일단 공간 복잡도는 생각하지 말고 해보자..
        var result = new LinkedList<Integer>(); // 이 부분이 문제가 될 것 같음?

        var oddIndex = 0;
        while (!numbers.isEmpty()) {
            var number = numbers.poll();
            if (isOdd(number)) {
                result.add(oddIndex, number);
                oddIndex++;
            } else {
                result.addLast(number);
            }
        }
        return result;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
