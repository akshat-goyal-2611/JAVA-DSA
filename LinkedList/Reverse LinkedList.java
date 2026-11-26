
class Solution {
    Node reverseList(Node head) {
        
        return reverse(head, null);
        
    }
    
    public Node reverse(Node curr, Node prev){
        
        if(curr == null) return null;
        if(curr.next == null){
            
            curr.next = prev;
            return curr;
        }
        
        Node Next = curr.next;
        curr.next = prev;
       
       return reverse(Next, curr);
        
    }
}
