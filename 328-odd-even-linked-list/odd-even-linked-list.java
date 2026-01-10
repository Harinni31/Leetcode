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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        //ListNode temp=new ListNode(-1);
        ListNode evenhead=even;
        while(even!=null && even.next!=null)
        {
          
           /* odd.next=even.next;
            odd=odd.next;
            //temp=temp.next;
             even.next=odd.next;
             even=even.next;
             */
             odd.next=odd.next.next;
              odd=odd.next;
              even.next=even.next.next;
               even=even.next;

        }
        odd.next=evenhead;
     //even.next=null;
        return head;
    }
}