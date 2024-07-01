package depth_first_search;

/**
 * Invert Binary Tree
 * - tree node가 주어졌을 때 트리를 뒤집어 반환하라.
 * 조건
 *  -
 * */

public class InvertBinaryTree {

    public static void main(String[] args) {

        /*
        *  4            4
        * 2 7    ->    7 2
        * 1369         9631
        * */
        var node = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        //var node = new TreeNode(4, new TreeNode(2), new TreeNode(7));

        var inverted = invertTree(node);

        System.out.println(inverted);
    }

    /**
     * 시도
     * - swap 방법을 이용해보자?
     * 풀이
     * -
     * 회고
     * - 이전에 풀었던 문제와 동일해서 크게 어렵지 않았다..
     * */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.right == null && root.left == null) {
            return root;
        }

        var left = invertTree(root.left);
        var right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
