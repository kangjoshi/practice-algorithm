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

        var node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        removeDuplicates(node);
    }

    /**
     * 시도
     * - 순회하면서 임시 변수에 값 할당
     * - 정렬 되어 있다? -> 현재 노드의 값이 임시 변수의 값보다 작다면 현재 노드의 값의 중복 값은 없음.
     * 풀이
     * -
     * */
    public static void removeDuplicates(ListNode head) {

    }
}
