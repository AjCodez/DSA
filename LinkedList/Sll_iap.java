import java.util.Scanner;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
  }
}
public class Sll_iap {
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
    public int count(){
    int c=0;
    Node temp = head;
    while(temp!=null){
      c++;
      temp = temp.next;
    }
    return c;
  }
    public void insertAtAnyPos(int x,int y){
    Node n = new Node(y);
    if(head==null){
        if(x>1){
            System.out.println("Invalid Position");
            System.exit(0);}
            else
      head = n;
    }
    else{
      if(x==1){
          n.next = head;
          head = n;
      }
    else if(x>count()+1){
        System.out.println("Invalid Position");
        System.exit(0);
    }
        else{
            Node temp = head;
            int c = 1;
            while(temp.next!=null){
                if(c==x-1) break;
                c++;
                temp = temp.next;
                
            }
            n.next = temp.next;
            temp.next = n;
        }
  }}
    public void print(){
        Node temp = head;
        while(temp!=null){
                System.out.print(temp.data+" ");
            temp=temp.next;
    }}
    public static void main(String[] args) {
        Sll_iap obj = new Sll_iap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            obj.insertAtEnd(temp);
        }
        int y = sc.nextInt();
        int x = sc.nextInt();
        obj.insertAtAnyPos(x,y);
        sc.close();
        obj.print();
        }
      
    }