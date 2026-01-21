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
    public ListNode deleteDuplicates(ListNode head) {
        /*Core Idea

If the current node and the next node have the same value,
just skip the next node.*/
        ListNode current =head;
        while(current!=null&& current.next!=null)
        {
            if(current.val ==current.next.val)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }

        }
        return head;
       /* HashSet<Integer>set=new HashSet<>();
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            
            if(set.contains(temp.val))
            {
                prev.next=temp.next;
               
            }
            else
            {
             set.add(temp.val);
             prev=temp;
            }
            temp=temp.next;
        }
        return head;*/
    }
}