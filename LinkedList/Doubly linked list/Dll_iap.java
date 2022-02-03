class Node {
    Node prev;
    int data;
    Node next;
    Node(){}
}

class Main {
    Node head;
    public int count(){
        int c=1;
        Node temp = head;
        while(temp.next!=null){
            ++c;
            temp=temp.next;
        }
        return c;
    }

    public void dinsertAtPos(int x, int pos) {
        Node n = new Node();
        n.data = x;
        if (head == null) {
            if (pos != 1)
                System.out.println("Invalid position");
            else head = n;
        } else {
            if (pos == 1) {
                n.next = head;
                head.prev = n;
                head = n;
            }
            if (pos > count() + 1)
                System.out.println("Invalid position");
            else {
                Node temp = head;
                int c = 1;
                while (temp != null) {
                    if (pos - 1 == c)
                        break;
                    c++;
                    temp = temp.next;
                }
                n.next = temp.next;
                n.prev = temp;
                if (pos == count() + 1)
                    temp.next = n;
                else {
                    temp.next.prev = n;
                    temp.next = n;
                }
            }
        }
    }
    public void dinsertAtBeg(int x){
        Node n = new Node();
        n.data=x;
        if(head==null)
           head=n;
        else{
           n.next=head;
           head.prev=n;
           head=n;
        }
     }
     public static void main(String[] args) {
        Main obj = new Main();
        obj.dinsertAtBeg(30);
        obj.dinsertAtBeg(20);
        obj.dinsertAtBeg(10);
        obj.dinsertAtPos(5, 2);
     }
}