import java.util.Scanner;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Sll_countNodes {
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
    public void print(){
        Node temp = head;
        int c=0;
        while(temp!=null){
            if(temp.data % 2==0)
            c++;
            temp=temp.next;
    }
        System.out.print(c);
    }
    public static void main(String[] args) {
      Sll_countNodes obj = new Sll_countNodes();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            obj.insertAtEnd(temp);
        }
        sc.close();
        obj.print();
        }
      
    }