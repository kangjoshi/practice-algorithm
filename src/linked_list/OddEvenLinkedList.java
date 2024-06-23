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

        var node = new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4))))));

        var result = oddEven(node);

        System.out.println();
    }

    /**
     * 시도
     * - 비교하면서 앞수가 짝수면서 뒷수가 홀수라면 뒤집기
     * 풀이
     * -
     * 회고
     * - 문제를 완전하게 잘 못 이해 했다.. 값이 짝수 홀수 인지에 따라 배치는 것인줄..
     * - 입력과 출력을 보고 문제를 이해 하는 습관보다는 지문을 잘 읽는 습관을 들여야겠다.
     * */
    public static ListNode oddEven(ListNode head) {

        if (head == null) {
            return head;
        }

        var odd = head;
        var even = head.next;

        var evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
