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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head1=l1;//reverseList(l1);
        ListNode head2=l2;//reverseList(l2);
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;
        int carry=0;
        while(head1!=null || head2!=null || carry!=0)
        {
            int sum=carry;
            if(head1!=null)
            {
                sum+=head1.val;
                head1=head1.next;
            }
            if(head2!=null)
            {
                sum+=head2.val;
                head2=head2.next;
            }
            current.next=new ListNode(sum%10);
            carry=sum/10;
            current=current.next;

       }
       //ListNode result=reverseList(dummy.next);
        return dummy.next;//reverseList(dummy.next);
        
  
    }
    private static ListNode reverseList(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}