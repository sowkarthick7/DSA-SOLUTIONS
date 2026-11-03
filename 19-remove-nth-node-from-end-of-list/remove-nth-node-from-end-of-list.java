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
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count-n==0){
            head=head.next;
        }
        ListNode tem = head;
        int c = 0;
        while(tem!=null){
            c++;
            if(c == count-n ){
                tem.next=tem.next.next;
            }
            tem = tem.next;
        }
        return head;
    }
}