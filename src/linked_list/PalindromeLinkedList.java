package linked_list;

import java.util.LinkedList;
import java.util.List;

/**
 * 팰린드롬 연결 리스트
 * - 연결 리스트가 팰린드롬 구조인지 판별하라
 * 조건
 *  -
 * */

public class PalindromeLinkedList {

    public static void main(String[] args) {
        /*
        var list = new LinkedList<String>();
        list.add("l");
        list.add("e");
        list.add("v");
        list.add("e");
        list.add("l");
        boolean palindrome = isPalindrome(list);
        System.out.println(palindrome);
         */

        var node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        System.out.println(isPalindrome(node));

    }

    /**
     * 시도
     * - 앞뒤로 하나씩 빼면서 같은지 비교
     * 풀이
     * - 데크를 이용한 풀이 (시도와 동일한 방법)
     * - 러너를 이용한 풀이 (다른 자료구조를 이용하지 않고 매우 빠른 방법)
     * 회고
     * - 자료구조의 특징을 잘 활용하면 문제를 쉽게 해결 할 수 있는 것!
     * */
    private static boolean isPalindrome(List<String> list) {
        while (list.size() > 1) {
            var start = (String) list.removeFirst();
            var end = (String) list.removeLast();
            if (!start.equals(end)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 러너 기법을 이용
     * */
    private static boolean isPalindrome(ListNode head) {
        var fast = head;
        var slow = head;

        // 빠른 러너가 끝까지 갈 때까지 느린 러너와 함께 진행
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            System.out.println();
        }

        // 홀수 개일 대 느린 러너가 한 칸 더 앞으로 가도록 처리
        if (fast != null) {
            slow = slow.next;
        }

        // 중간에 도달한 느린 러너를 기준으로하여 역순 연결 리스트를 만듬.
        ListNode rev = null;
        while (slow != null) {
            // 느린 러너 역순 연결 리스트 rev를 만들어 나감.
            var next = slow.next;
            slow.next = rev;
            rev = slow;
            slow = next;
        }

        // rev 연결 리스트를 끝까지 이동하며 비교
        while (rev != null) {
            // 역순 연결 리스트 rev와 기존 연결 리스트 head를 차례대로 비교
            if (rev.val != head.val) {
                return false;
            }

            rev = rev.next;
            head = head.next;
        }

        return true;
    }


}
