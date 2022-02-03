class Node{
    Node prev;
    int data;
    Node next;
 }
 class Main {
    Node head;
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
    }
 }
 