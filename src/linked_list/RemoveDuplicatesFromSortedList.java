package linked_list;

/**
 * 정렬 연결 리스트에서 중복 제거
 * -
 * 조건
 *  - 0에서 최대 300 크기
 *  - value는 -100 ~ 100
 *  - 연결리스트는 정렬 되어 있음.
 * */

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        // 1 -> 1 -> 2 => 1 -> 2
        // 1 -> 1-> 2 -> 3 -> 3 => 1 -> 2 -> 3
        var node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2,  new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(99))))))));
        var removed = removeDuplicates(node);

        removed.printAll();
    }

    /**
     * 시도
     * 1차 생각
     * - 순회하면서 임시 변수에 값 할당
     * - 정렬 되어 있다? -> 현재 노드의 값이 임시 변수의 값보다 작다면 현재 노드의 값의 중복 값은 없음.
     * 2차 생각
     * - left, right 비교 하면서 같다면 right를 다음 값으로
     * 풀이
     * -
     * */
    public static ListNode removeDuplicates(ListNode head) {
        var left = head;
        var right = head.next;
        while (right != null) {
            // System.out.println(left.val + " : " + right.val);
            if (left.val == right.val) {
                right = right.next;
                left.next = right;
            } else {
                left = left.next;
                right = right.next;
            }
        }
        return head;
    }
}
