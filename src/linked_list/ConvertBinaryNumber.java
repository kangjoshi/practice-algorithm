package linked_list;

import java.util.ArrayList;

/**
 * 연결 리스트를 숫자로 반환
 * - 0, 1 값으로 구성된 연결 리스트를 연결하고 그 결과를 10진수로 변환
 * 조건
 *  - 노드의 값은 0 또는 1
 * */

public class ConvertBinaryNumber {

    public static void main(String[] args) {
        var node = new ListNode(1, new ListNode(0, new ListNode(1)));

        var numberString = new StringBuilder();
        while (node != null) {
            numberString.append(node.val);
            node = node.next;
        }

        System.out.println(Integer.parseInt(numberString.toString(), 2));
    }

    /**
     * 시도
     * - 순회하면서 값들을 추출후 연결, 그 값을 10진수로 변경
     * 풀이
     * -
     * 회고
     * - 깔금 한 것 같지만, 가능하다면, 재귀 연습을 위해 재귀로 변경 해봐도 좋을 것 같음.
     * */
}
