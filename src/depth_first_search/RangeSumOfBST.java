package depth_first_search;

import java.util.ArrayList;
import java.util.List;

/**
 * Range Sum of BST
 * - tree node, int low, int high 세 파라미터가 주어졌을 때 low ~ high에 속한 노드의 합을 구하라
 * 조건
 *  -
 * */

public class RangeSumOfBST {

    public static void main(String[] args) {

        var root = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18)));

        var low = 7;
        var high = 15;

        var result = rangeSumBST(root, low, high);

        System.out.println(result);
    }

    /**
     * 시도
     * - 전체 node 순회, 값이 range에 포함 여부 판단하여 포함 한다면 더하기
     * 풀이
     * -
     * 회고
     * - 재귀 리턴값을 처리? 하는 방법이 아직 좀 헷갈림. 익숙하지 않음..
     * */
    public static int rangeSumBST(TreeNode root, int low, int high) {
        var numbers = new ArrayList<Integer>();
        dfs(root, low, high, numbers);

        var sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void dfs(TreeNode node, int low, int high, List<Integer> numbers) {
        if (node == null) {
            return;
        }

        if (node.val >= low && node.val <= high) {
            numbers.add(node.val);
        }
        dfs(node.left, low, high, numbers);
        dfs(node.right, low, high, numbers);
    }

}
