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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
        
        }
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }  
      ListNode prev=null;
      ListNode curr=slow.next;
      slow.next=null;
      while(curr!=null){
       ListNode next=curr.next;
       curr.next=prev;
       prev=curr;
       curr=next;
      }
      ListNode firest=head;
      ListNode second=prev;
      while(second!=null){
        ListNode temp1=firest.next;
        ListNode temp2=second.next;
        firest.next=second;
        second.next=temp1;
        firest=temp1;
        second=temp2;
      }
    }
}