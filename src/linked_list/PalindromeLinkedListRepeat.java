package linked_list;

import linked_list.ListNodeObject;

import java.util.List;

/**
 * 팰린드롬 연결 리스트
 * - 연결 리스트가 팰린드롬 구조인지 판별하라
 * 조건
 *  -
 * */

public class PalindromeLinkedListRepeat {

    public static void main(String[] args) {
        var node = new ListNodeObject("l", new ListNodeObject("e", new ListNodeObject("v", new ListNodeObject("e", new ListNodeObject("l")))));

        boolean palindrome = isPalindrome(node);
        System.out.println(palindrome);
    }

    /**
     * 시도
     * - 러너 기법을 사용
     * 풀이
     * -
     * 회고
     * - 노드를 뒤집는(?) 방법이 어려웠다.
     * */

    /**
     * 러너 기법을 이용
     * */
    private static boolean isPalindrome(ListNodeObject head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 생략해도 문제는 없다. 하지만 비교가 한번 더 되므로 유의
        if (fast != null) {
            slow = slow.next;
        }

        ListNodeObject prev = null;
        while (slow != null) {
            var next = slow.next;

            slow.next = prev;
            prev = slow;
            slow = next;
        }

        while (prev != null) {
            if (prev.val != head.val) {
                return false;
            }

            prev = prev.next;
            head = head.next;
        }

        return true;
    }


}
