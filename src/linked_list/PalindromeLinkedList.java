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
        var list = new LinkedList<String>();
        list.add("l");
        list.add("e");
        list.add("v");
        list.add("e");
        list.add("l");

        boolean palindrome = isPalindrome(list);

        System.out.println(palindrome);
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
}
