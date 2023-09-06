/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]res=new ListNode[k];
       ListNode cur=head;int n=0;
        while(cur!=null){
            cur=cur.next;
            n++;
        }
        int len =n/k;
        int dis=n%k;
        ListNode pre=null;
        ListNode node=head;
        
       int i=0;
        while(i<k && node!=null){
            res[i]=node;
            
        for(int j=0;j<len+(dis>0?1:0);j++){
                pre=node;
            node=node.next;
                }
            pre.next=null;
            i++;dis--;
            
        }
        return res;
        
    }
}