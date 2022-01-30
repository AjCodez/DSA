import java.util.Scanner;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Sll_searchNode {
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
    public void find(int a){
        Node temp = head;
        int f=0;
        while(temp!=null){
            if(temp.data==a){
                System.out.print("Yes");
                f++;
                break;
            }
            temp=temp.next;}
        if(f==0) System.out.println("No");
    }
    public static void main(String[] args) {
        Sll_searchNode obj = new Sll_searchNode();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            obj.insertAtEnd(temp);
        }
        int a=sc.nextInt();
        sc.close();
        obj.find(a);
        }
      
    }