public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }

        ListNode first = head;
        ListNode Next = head;

        while(Next !=null && Next.next != null){
            first = first.next;
            Next = Next.next.next;

            if(first == Next){
                return true;
            }
        }
        return false;
        
    }
}