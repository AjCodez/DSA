import java.util.Scanner;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Sll_findMid {
  Node head;
  public void insertAtEnd(int x){
    Node n = new Node(x);
    if(head==null){
      head = n;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = n;
    }
  }
    public void print(int n){
        Node temp = head;
        int c=0;
        if(n%2==0) n=n/2-1;
        else n=(n/2);
        while(temp!=null){
            if(n==c)
            System.out.println(temp.data);
            temp=temp.next;
            c++;
    }    }
    public static void main(String[] args) {
      Sll_findMid obj = new Sll_findMid();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            obj.insertAtEnd(temp);
        }
        sc.close();
        obj.print(n);
        }
    }