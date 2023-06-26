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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return buildTree(nums, 0, nums.length - 1);
    }

    public TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) return null;
        
        int maxi = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[maxi]) {
                maxi = i;
            }
        }
        
        TreeNode root = new TreeNode(nums[maxi]);
        root.left = buildTree(nums, start, maxi - 1);
        root.right = buildTree(nums, maxi + 1, end);
        
        return root;
    }
}
