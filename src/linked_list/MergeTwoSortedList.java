package linked_list;

import java.util.Collections;
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

        var node1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        var node2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        var merged = merge(node1, node2);
        merged.printAll();
    }

    /**
     * 시도
     * - 재귀 호출하며 두 리스트를 비교
     * 풀이
     * -
     * 회고
     * -
     * */
    public static ListNode merge(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        System.out.println(node1.val + " : " + node1.val);

        if (node1.val <= node2.val) {
            node1.next = merge(node1.next, node2);
            return node1;
        } else {
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
}
