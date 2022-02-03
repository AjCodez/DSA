import java.util.*;

class Node{
    int data;
    Node next;
    Node(int n){
        this.data = n;
    }
}
public class Sll_iae {
    static Node head;
    public static void insertAtEnd(int a){
        Node n = new Node(a);
        if(head==null) head=n;
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next= n;
        }
    }
    public static void print(){
        Node temp = head;
        while(temp!=null){
                System.out.print(temp.data+" ");
            temp=temp.next;
    }}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int n = sc.nextInt();
            insertAtEnd(n);
        }
        sc.close();
        print();
    }
}