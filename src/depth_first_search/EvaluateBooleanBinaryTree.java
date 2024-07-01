package depth_first_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Evaluate Boolean Binary Tree
 * - tree가 주어졌을 때
 * - left node의 값이 0이라면 false, 1이라면 true
 * - left node가 아닌 node의 값이 2라면 or, 3이라면 and를 나타낸다.
 * - 트리를 순회 하며 결과를 반환하라.
 * 조건
 *  - left node라면 자식 노드는 없음
 * */

public class EvaluateBooleanBinaryTree {

    public static void main(String[] args) {
        var root = new TreeNode(2, new TreeNode(1), new TreeNode(3, new TreeNode(0), new TreeNode(1)));

        var result = evaluateTree(root);
        System.out.println(result);
    }

    /**
     * 시도
     * - left 노드라면 더이상 탐색은 불필요. 그 자체가 값임.
     * 풀이
     * -
     * 회고
     * - 문제를 너무 어렵게 생각 했다..
     * */
    public static boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        // left 노드라면 값 그 자체로 평가 받아야 함.
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        var left = evaluateTree(root.left);
        var right = evaluateTree(root.right);

        if (root.val == 2) {
            return left || right;
        } else {
            return left && right;
        }
    }


}
