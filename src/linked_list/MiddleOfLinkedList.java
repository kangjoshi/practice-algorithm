package linked_list;

/**
 * 연결 리스트의 중간 값
 * - 주어진 연결리스트의 중앙 노드를 찾아서 반환
 * 조건
 *  - 만약 중앙 노드가 두개라면 2번째 노드를 반환
 * */

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        //var node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        // 3
        var node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        // 4

        var middle = middleNode(node);

        System.out.println(middle.val);
    }

    /**
     * 시도
     * - 중앙 값을 알려면?
     *  - 전체 노드의 개수를 알아야 함
     *      - 순회하면서 전체 노드 개수를 구하고 %2하면 절반 값. 그 지점의 노드를 반환
     * - 좀 더 우아한 방법은 없을까...
     * 풀이
     * -
     * 회고
     * - 좀 더 우하한 방법이 있을 것 같은데.. 투 포인터?
     * */
    // 무식하게 풀어보기
    public static ListNode middleNode(ListNode head) {
        var size = 0;
        var node = head;
        while(node != null) {
            node = node.next;
            size++;
        }

        var middle = (size / 2);
        node = head;
        while (middle > 0) {
            middle--;
            node = node.next;
        }

        return node;
    }
}
