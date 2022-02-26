import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class PrintReverseLLUsingRecursion{
    static Node head;

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

    public static void print(Node temp){
        if(temp==null)
            return;
        else{
            print(temp.next);
            System.out.print(temp.data+" ");
        }
    }
    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        insertAtEnd(50);
        print(head);
    }
}