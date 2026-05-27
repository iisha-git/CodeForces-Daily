class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class mergeListHelper{

    public void mergeListHelper(Node list1, Node list2,Node curr){
        if(list1==null){
            curr.next = list2;
            return;
        }
        if(list2==null){
            curr.next = list1;
            return;
        }

        if(list1.data<list2.data){
            curr.next = list1;
            mergeListHelper(list1.next, list2, curr);
        }else{
            curr.next = list2;
            mergeListHelper(list1, list2.next, curr);
        }
    }


    public Node mergeList(Node list1,Node list2){
        Node prev = new Node(0);
        Node curr = prev;
        
        mergeListHelper(list1, list2, curr);
        // while(list1!=null && list2!=null){
        //     if(list1.data<list2.data){
        //         curr.next = list1;
        //         list1 = list1.next;
        //         curr = curr.next;
        //     }else{
        //         curr.next = list2;
        //         list2 = list2.next;
        //         curr = curr.next;

        //     }
        // }
        // if(list1==null){
        //     curr.next = list2;
        // }
        // if(list2==null){
        //     curr.next = list1;
        // }

        return prev.next;
        
    }

}

