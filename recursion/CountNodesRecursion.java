class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class CountNodesRecursion {
    static Node head;

    public static int count(Node temp){
        if(temp==null)
            return 0;
        else{
            return 1+count(temp.next);
        }
    }

    public static void insertAtEnd(int x){
        Node n = new Node(x);
        if(head==null)
            head=n;
        else{
            Node temp= head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }

    public static void main(String[] args) {
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        insertAtEnd(5);
        System.out.println(count(head));
    }
}
