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
        ListNode currentNode = head;
        int sizeOfLinkedList = 0;
        
        while(currentNode != null){
            currentNode = currentNode.next;
            sizeOfLinkedList++;
        }
        
        // edge cases
        if(sizeOfLinkedList == 1 && n == 1){
            return null;
        }
        else if(n == sizeOfLinkedList){
            head = head.next;
            return head;
        }
        
        currentNode = head;
        
        for(int i = 0; i < sizeOfLinkedList - n - 1; i++){
            currentNode = currentNode.next;
        }
        
        if(n == 1 && sizeOfLinkedList != 1){
            currentNode.next = null;
        }
        else{
            ListNode tmp = currentNode.next;
            currentNode.next = tmp.next;
        }
        
            
        return head;
        
    }
}
