package recursion;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SwapNodesRec{

    public void SwapNodeRecHelper(Node prev , Node curr){
        if(curr == null || curr.next == null){
            return;
        }
        Node f = curr;
        Node s = curr.next;

        f.next = s.next;
        s.next = f;
        prev.next = s;
        SwapNodeRecHelper(f, f.next);

    }
    
    public Node swapPairs(Node head){
        Node dummy = new Node(-1);

        dummy.next = head;
        
        Node p = dummy;

        SwapNodeRecHelper(p,head);

        return dummy.next;
    }

    public void printList(Node head){

        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // create nodes
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        // connect nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // object creation
        SwapNodesRec obj = new SwapNodesRec();

        System.out.println("Original List:");
        obj.printList(n1);

        // swap pairs
        Node result = obj.swapPairs(n1);

        System.out.println("After Swapping:");
        obj.printList(result);
    }
}