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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp  = head;
        int c = 1;
        ListNode h=head;
        if(head==null||k==0){
            return head;
        }
        while(temp.next!=null){
            c++;
            temp = temp.next;
        }
        temp.next=head;
        k=k%c;
        ListNode t=head;
        for(int i=1;i<c-k;i++){
            t=t.next;
        }
        head=t.next;
        t.next=null;
        return head;
    }
}