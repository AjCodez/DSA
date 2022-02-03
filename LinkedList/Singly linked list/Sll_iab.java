import java.util.Scanner;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Sll_iab {
  Node head;
  public void insertAtBeg(int x){
    Node n = new Node(x);
    n.next = head;
      head = n;
  }
    public void print(){
        Node temp = head;
        while(temp!=null){
                System.out.print(temp.data+" ");
            temp=temp.next;
    }}
    public static void main(String[] args) {
        Sll_iab obj = new Sll_iab();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            obj.insertAtBeg(temp);
        }
        sc.close();
        obj.print();
        }
      
    }