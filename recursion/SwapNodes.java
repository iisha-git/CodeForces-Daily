package recursion;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SwapNodes{
    
    public Node swapPairs(Node head){
        Node dummy = new Node(-1);
        dummy.next = head;

        Node prev = dummy;

        while (head!=null && head.next!=null) {
            Node f = head;
            Node s = head.next;

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