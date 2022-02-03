import java.util.Scanner;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Sll_evenNodes {
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
        int i=1;
        while(temp!=null){
            if(i%2==0){
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
            i++;
    }}
    public static void main(String[] args) {
        Sll_evenNodes obj = new Sll_evenNodes();
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