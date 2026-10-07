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
    public ListNode modifiedList(int[] nums, ListNode head) {
     /* ListNode prev=null;
      for(int i=0;i<nums.length;i++){
        ListNode temp=head;
        while(temp!=null){
          if(temp.val==nums[i]){
             if(prev==null){
                head=temp.next;
             }else{
                prev.next=temp.next;
             }
             temp=temp.next;
          }else{
            prev=temp;
            temp=temp.next;
          }
        }
        prev=null;
      }
      return head;  */
      HashSet<Integer> set=new HashSet<Integer>();
      for(int n:nums){
        set.add(n);
      }
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode temp=head;
      ListNode prev=dummy;
      while(temp!=null){
        if(set.contains(temp.val)){
            prev.next=temp.next;
        }else{
           prev=temp;
        }
        temp=temp.next;
      } 
      return dummy.next;
    }
}