class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class mergeList{
    public Node mergeList(Node list1,Node list2){
        Node prev = new Node(0);
        Node curr = prev;
        
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;

            }
        }
        if(list1==null){
            curr.next = list2;
        }
        if(list2==null){
            curr.next = list1;
        }

        return prev.next;
        
    }

}

