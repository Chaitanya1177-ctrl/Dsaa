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
        if(head==null|| head.next==null || k==0)return head;
        int n=1;
        ListNode curr=head;
    while(curr.next!=null){
        curr=curr.next;
        n++;
    }
    k=k%n;
    if(k==0)return head;
    
    curr.next=head;
    int jump=n-k;
    while(jump!=0){
        curr=curr.next;
        jump--;
    }
    ListNode tail=curr.next;
    curr.next=null;
    return tail;
    }
}