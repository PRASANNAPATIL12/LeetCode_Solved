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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null )return null;
        if(root1==null){
            return root2;
        }
         if(root2==null){
            return root1;
        }
        TreeNode node=new TreeNode(root1.val+root2.val);
        node.left=mergeTrees(root1.left,root2.left);
        node.right=mergeTrees(root1.right,root2.right);
        return node;
        
        
    }
}




// lass Solution {
    
//     public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//         if (t1 == null && t2 == null) return null;
//         if (t1 == null) return t2;
//         if (t2 == null) return t1;
        
//         TreeNode new_node = new TreeNode(t1.val + t2.val);
        
//         new_node.left = mergeTrees(t1.left, t2.left);
//         new_node.right = mergeTrees(t1.right, t2.right);
        
//         return new_node;
//     }
// }