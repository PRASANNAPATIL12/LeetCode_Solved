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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root==null)return null;
        String curString =Integer.toString(root.val);
        if(root.left==null && root.right==null)res.add(curString);
        if(root.left!=null)dfs(root.left,curString,res);
        if(root.right!=null)dfs(root.right,curString,res);
        return res;
            
        
    }
    
    public void dfs(TreeNode node,String curString,List<String> res){
        curString+="->"+node.val;
        if(node.left==null && node.right==null){
        res.add(curString);
            return ;
        }
        
         if(node.left!=null)dfs(node.left,curString,res);
        if(node.right!=null)dfs(node.right,curString,res);
        
    }
}