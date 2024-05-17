package linked_list;

import java.util.LinkedList;
import java.util.List;

/**
 * 페어의 노드 스왑
 * - 연결 리스트를 입력 받아 페어 단위로 스왑하라
 * 조건
 *  -
 * */

public class SwapNodesInPairs {

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 2 -> 1 -> 4 -> 3 -> 6 -> 5
        var list = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6));

        swap(list);

        list.forEach(System.out::print);
    }

    /**
     * 시도
     * - +2씩 돌면서 i <-> i - 1
     * 풀이
     * -
     * */
    public static void swap(List<Integer> list) {
        Integer temp;
        for (int i = 0; i < list.size(); i += 2) {
            temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}
