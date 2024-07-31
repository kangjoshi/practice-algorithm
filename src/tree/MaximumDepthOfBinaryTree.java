package tree;

/**
 * 이진 트리의 최대 깊이
 * - 이진 트리의 최대 깊이를 구하라
 * 조건
 *  -
 * */

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        //var root = new TreeNode(3, new TreeNode(9), new TreeNode(10, new TreeNode(15, new TreeNode(1), new TreeNode(2)), new TreeNode(7)));
        //var root = new TreeNode(3);
        var root = new TreeNode(3, new TreeNode(1), new TreeNode(2));

        var depth = dfs(root, 0);

        System.out.println(depth);
    }

    /**
     * 시도
     * - root 부터 left, right를 탐색, 탐색 해 나갈 때 마다 depth 값 증가, left, right 트리 중 높은 값(가장 깊은 노드의 수) 리턴
     * 풀이
     * -
     * */
    public static int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        return Math.max(dfs(node.left, depth + 1), dfs(node.right, depth + 1));
    }


}
