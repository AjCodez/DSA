class Node{
    Node prev;
    int data;
    Node next;
}

class Main {
    Node head;
    Node tail;
    public void dinsertAtBeg(int data) {
        Node n = new Node();
        n.data = data;
        if (head == null)
            head = n;
        else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void ddeleteAtBeg() {
        if (head == null)
            return;
        else {
            head = head.next;
            head.prev = null;
        }
    }

    public void ddeleteAtEnd(){
        if(head==null)return;
        else{
            if(head.next==null){
                head=null;
                tail=null;
            } 
            else{
                tail.prev.next=null;
                tail=tail.prev;
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.dinsertAtBeg(30);
        obj.dinsertAtBeg(20);
        obj.dinsertAtBeg(10);
        obj.ddeleteAtBeg();
        obj.ddeleteAtEnd();
    }
}