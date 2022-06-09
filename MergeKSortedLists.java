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
    
    
    /*
        Algorithm:        
            1.iterate through the list node array
            2.for every linked list of the ListNode array 
              add the values of all the nodes to a priority queue
            3.take all the values out of a priority queue and add 
              them to a new linked list 

        Space Needed:
            - PriorityQueue<Integer> -> to sort and store the values
            - ListNode Head -> to have a pointer to the head of the returned 
                               linked list
            - ListNode currentNode -> to maintain a pointer to the current node
    
    */
    public ListNode mergeKLists(ListNode[] lists) {
        
        Queue<Integer> sortedQueue = new PriorityQueue<Integer>();
        ListNode head = null;
        
        ListNode currentNode = new ListNode();
        for(int i = 0; i < lists.length; i++){
            currentNode = lists[i]; 
            while(currentNode != null){
              sortedQueue.add(currentNode.val);
              currentNode = currentNode.next;
            }
        }
            
        if(!sortedQueue.isEmpty()){
            head = new ListNode(sortedQueue.remove());
            currentNode = head;
            
            while(!sortedQueue.isEmpty()){
                currentNode.next = new ListNode(sortedQueue.remove());
                currentNode = currentNode.next;
            }
        }
        
        
        return head;  
    }
}
