class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class SwapNodes{
    
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while (head!=null && head.next!=null) {
            ListNode f = head;
            ListNode s = head.next;

            //swap
            f.next = s.next;
            s.next = f;
            prev.next = s;

            prev = f;
            head = f.next;

        }

        return dummy.next;
    }
}