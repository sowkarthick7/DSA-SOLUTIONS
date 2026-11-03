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
        ListNode temp = head;
        int count=1;
        if(head==null){
            return head;
        }
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        ListNode t = head;
        int c=count/2;
        while(c!=0){
            c--;
            temp.next=t.next;
            temp=temp.next;
            t.next=t.next.next;
            t=t.next;
        }
        temp.next=null;
        return head;
    }
}