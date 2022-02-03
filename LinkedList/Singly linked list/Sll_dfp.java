import java.util.*;

class Node{
    int data;
    Node next;
    Node(int n){
        this.data = n;
    }
}
public class Sll_dfp {
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
    
    public static int count(){
        int c=1;
        Node temp = head;
        while(temp.next!=null){
            ++c;
            temp=temp.next;
        }
        return c;
    }
    public static void deleteFromPos(int pos){
        if (head == null)
            return;
        else {
            if (head.next == null) {
                if (pos != 1) {
                    System.out.println("Invalid Position");
                    System.exit(0);
                }
                else head = null;
            } 
            else if(pos==1) head = head.next;
            else {
                int c = 1;
                if (pos > count()){
                    System.out.println("Invalid Position");
                    System.exit(0);
                }
                else {
                    Node temp = head;
                    while (temp != null) {
                        if (c == pos - 1) {
                            break;
                        }
                        c++;
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                }
            }
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
        int p = sc.nextInt();
        sc.close();
        deleteFromPos(p);
        print();
    }
}