class Node{
    Node prev;
    int data;
    Node next;
 }
 class Main {
    Node head;
    public void dinsertAtEnd(int x){
       Node n = new Node();
       n.data=x;
       if(head==null)
          head=n;
       else{
          Node temp = head;
          while(temp.next!=null){
              temp=temp.next;
          }
          n.next=temp.next;
          n.prev=temp;
          temp.next=n;
       }
    }
    public static void main(String[] args) {
       Main obj = new Main();
       obj.dinsertAtEnd(30);
       obj.dinsertAtEnd(20);
       obj.dinsertAtEnd(10);
    }
 }
 