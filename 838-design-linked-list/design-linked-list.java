class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    Node head;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        Node temp=head;
        if(index<0){
            return -1;
        }
        for(int i=0;i<index;i++){
            if(temp==null){
                return -1;
            }
            temp=temp.next;
        }
        if(temp==null){
            return -1;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        return;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if(index<0 ){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp = temp.next;
        }
        if(temp==null){
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||head==null){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            return;
        }
        temp.next=temp.next.next;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */