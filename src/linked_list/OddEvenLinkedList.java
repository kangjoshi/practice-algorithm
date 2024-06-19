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

        var node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        var result = oddEven(node);

        System.out.println();
    }

    /**
     * 시도
     * - 비교하면서 앞수가 짝수면서 뒷수가 홀수라면 뒤집기
     * 풀이
     * -
     * */
    public static ListNode oddEven(ListNode head) {
        var dummy = new ListNode(0, head);

        var current = dummy.next;
        while (current.next != null) {
            var left = current;
            var right = current.next;

            if (isEven(left) && isOdd(right)) {
                current = right;
                current.next = left;
            }

            current = current.next;
        }


        return dummy.next;
    }

    public static boolean isOdd(ListNode node) {
        return node.val % 2 == 1;
    }

    public static boolean isEven(ListNode node) { return !isOdd(node); }
}
