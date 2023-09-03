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
    class tclass{
        int dia;
        int ht;
        tclass(int d,int h){
            this.dia=d;
            this.ht=h;
        }
    }
    public  tclass diam(TreeNode root){
        if(root==null)return new tclass(0,0);
        
        tclass left=diam(root.left);
        tclass right=diam(root.right);
        
        
        int myheight=Math.max(left.ht,right.ht)+1;
        
        int d1=left.dia;
        int d2=right.dia;
        int d3=left.ht+right.ht;
        
        int mydia=Math.max(d3,Math.max(d1,d2));
        tclass myinfo=new tclass(mydia,myheight);
        return myinfo;

        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return  0;
        
        tclass ts=diam(root);
        return ts.dia;
        
        
        
    }
}