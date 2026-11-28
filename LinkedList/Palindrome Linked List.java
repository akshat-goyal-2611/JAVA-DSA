
class Solution {
    public boolean isPalindrome(Node head) {
        
        // find mid
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        slow = reverse(slow);
        
        fast = head;
        
        while(slow != null){
            
            if(slow.data != fast.data) return false;
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public Node reverse(Node head){
        
        Node curr = head, prev = null;
        
        while(curr != null){
            
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        
        return prev;
    }
}
