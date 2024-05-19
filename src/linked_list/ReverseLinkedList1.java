package linked_list;

import strings.Palindrome;

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
        var node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var reversed = reverse(node, null);

        reversed.printAll();
    }

    /**
     * 시도
     * - node가 알 수 있는 것?
     *  - 다음 노드
     * 풀이
     * -
     * */
    public static ListNode reverse(ListNode node, ListNode prev) {
        if (node == null) {
            return prev;
        }
        var next = node.next;
        node.next = prev;
        return reverse(next, node);
    }
}
