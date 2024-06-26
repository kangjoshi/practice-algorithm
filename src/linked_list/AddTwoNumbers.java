package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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
        /*var numbers1 = new LinkedList<>(List.of(2, 4, 3));
        var numbers2 = new LinkedList<>(List.of(5, 6, 2));
        var result = sum(numbers1, numbers2);
        result.forEach(System.out::print);*/

        var node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var node2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        //var node1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        //var node2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        var sum = sum(node1, node2);
        sum.printAll();
    }

    /**
     * 시도
     * - 뒤집혀 있는 순서대로 계산, 계산에서 10을 초과한다면 다음 계산 대상에게 +1
     * 풀이
     * -
     * */
    /*
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
    }*/

    /**
     * 시도
     * - 두 자리수를 더해서 신규 노드로 만든다.
     * - 신규 노드를 순회하며 10 이상이라면 나머지로 처리하고 이후 자리를 올림 처리
     * 풀이
     * -
     * 회고
     * - 속도를 조금 더 개선할 수 있는 방법?
     * - 문제를 잘 읽어야겠다..
     * */
    public static ListNode sum(ListNode node1, ListNode node2) {
        ListNode result = null;
        ListNode prev = null;
        int carry = 0;

        while (node1 != null || node2 != null) {
            var sum = sumTwoNode(node1, node2) + carry;

            carry = sum / 10;
            sum = sum % 10;

            if (result == null) {
                result = new ListNode(sum);
                prev = result;
            } else {
                var newNode = new ListNode(sum);
                prev.next = newNode;
                prev = newNode;
            }

            if (node1 != null) {
                node1 = node1.next;
            }
            if (node2 != null) {
                node2 = node2.next;
            }
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return result;
    }

    public static int sumTwoNode(ListNode node1, ListNode node2) {
        return getValueOrZero(node1) + getValueOrZero(node2);
    }

    public static int getValueOrZero(ListNode node) {
        return Optional.ofNullable(node).map(n -> n.val).orElse(0);
    }

}
