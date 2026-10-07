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
   static ListNode getNode(ListNode head,int k){
    ListNode temp=head;
    while(temp!=null&&k>1){
     temp=temp.next;
     k--;
    }
    return temp;
   }
  static ListNode reverse(ListNode head){
    ListNode temp=head;
    ListNode prev=null;
    while(temp!=null){
        ListNode front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
    }
    return prev;
  }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
         ListNode kthNode=getNode(temp,k);
            if(kthNode==null){
                prev.next=temp;
              break;
            }
            ListNode newNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(head==temp){
                head=kthNode;
            }else{
              prev.next=kthNode;
            }
          prev=temp;
          temp=newNode;
        }
        return head;
    }
}