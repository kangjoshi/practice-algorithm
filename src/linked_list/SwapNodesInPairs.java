package linked_list;

import java.util.LinkedList;
import java.util.List;

/**
 * 페어의 노드 스왑
 * - 연결 리스트를 입력 받아 페어 단위로 스왑하라
 * 조건
 *  -
 * */

public class SwapNodesInPairs {

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 2 -> 1 -> 4 -> 3 -> 6 -> 5

        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        var swapped = pairSwap(head);
        System.out.println();
    }

    /**
     * 시도
     * - slow-fast로 한 pair씩 뒤집어 주기
     * 풀이
     * -
     * 회고
     * - 머리로는 금방 떠 올랐는데 실제 구현은 생각 보다 쉽지 않은 문제 인 것 같음.
     * - dummy를 써서 해결 하는 방법은 미쳐 생각 못했음.
     * */
    public static ListNode pairSwap(ListNode head) {
        var dummy = new ListNode(0, head);

        var current = dummy;
        while (current.next != null && current.next.next != null) {
            var left = current.next;
            var right = current.next.next;

            left.next = right.next;

            current.next = right;
            current.next.next = left;
            current = current.next.next;
        }
        return dummy.next;
    }

}
