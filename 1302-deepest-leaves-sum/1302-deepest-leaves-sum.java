/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        return util1(root);
    }
    int maxHeight = Integer.MIN_VALUE;
    int sum = 0;

    public int util1(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    public void dfs(TreeNode root, int currHeight) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (currHeight > maxHeight) {
                maxHeight = currHeight;
                sum = root.val;
            } else if (currHeight == maxHeight) {
                sum += root.val;
            }
        }
        dfs(root.left, currHeight + 1);
        dfs(root.right, currHeight + 1);
    }
}