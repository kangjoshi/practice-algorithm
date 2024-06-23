package linked_list;

import java.util.List;

/**
 * 역순 연결리스트2
 * - 위치 left에서 right까지 역순으로 만들어라. 위치는 1부터 시작
 * 조건
 *  -
 * */

public class ReverseLinkedList2 {

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 left=2, right=5
        // = 1 -> 5 -> 4 -> 3 -> 2 -> 6

        var head = new ListNode(3, new ListNode(5));

        var left = 1;
        var right = 2;

        reverseNode(head, left, right);
    }

    /**
     * 시도
     * - 쉽게 생각 해보자.
     *  - 변경이 필요 없는 노드 (left 이전까지의 노드, right 이후의 노드) 변경이 필요한 노드 (left-right 사이의 노드)를 구해서 변경이 필요한 노드만 뒤집고 이후 연결
     * 풀이
     * -
     * */
    public static ListNode reverseNode(ListNode head, int left, int right) {
        var front = new ListNode(0, head);
        var end = head;
        for (int i = 1; i < left; i++) {
            front = front.next;
        }
        for (int i = 1; i < right; i++) {
            end = end.next;
        }

        front.next = reverse(front.next, end.next, right - left);;

        return head;
    }

    public static ListNode reverse(ListNode node, ListNode prev, int left) {
        if (node == null || left < 0) {
            return prev;
        }

        var next = node.next;
        node.next = prev;
        return reverse(next, node, left - 1);
    }

}
