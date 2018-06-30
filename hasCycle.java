public class Solution {
    public boolean hasCycle(ListNode head) {
        	if(head == null || head.next == null) {
		return false;
	}
	
	ListNode node = head;
	while(node != null) {
		
		if(node.next == head) {
			return true;
		}
		
		ListNode temp = node.next;
		node.next = head;
		node = temp;
	}
	
	return false;
    }
}