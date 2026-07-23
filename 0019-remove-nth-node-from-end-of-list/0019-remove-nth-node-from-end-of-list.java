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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t=head;
        int count=0;
        if(head.next==null)
        {
            return head.next;
        }
        while(t!=null)
        {
            count++;
            t=t.next;
        }
        if(count==n)
        {
            return head.next;
        }
        int d=count-n;
        t=head;
        for(int i=1;i<d;i++)
        {
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}