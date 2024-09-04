class Solution {
    ListNode swap(ListNode curr){
        if(curr == null || curr.next == null){
            return curr;
        }
        ListNode next = curr.next;
        curr.next = swap(next.next);
        next.next = curr;
        return next;
        
      
    }
    public ListNode swapPairs(ListNode head) {
        return swap(head);
   
    }
}
