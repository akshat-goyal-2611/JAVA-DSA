
class Solution {
    public Node rotate(Node head, int k) {
        
        if(head.next == null) return head;
        
        Node temp = head;
        
        int cnt = 0;
        Node h1 = head, h2 = head;
        
        while(temp != null){
            
            cnt++;
            temp = temp.next;
        }
        
        k = k%cnt;
        
        if(k == 0) return head;
        
        for(int i = 1; i <= k; i++){
            h2 = h2.next;
        }
        
        h1 = reverse(h1, k);
        h2 = reverse(h2, cnt-k);
        
        head.next = h2;
        
        return reverse(h1, cnt);
        
    }
    
    public Node reverse(Node head, int n){
        
        Node curr = head, prev = null;
        
        for(int i = 1; i <= n; i++){
            
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        
        return prev;
    }
}
