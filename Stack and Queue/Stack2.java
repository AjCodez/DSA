class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
  }
  public class Stack2 {
    Node top;
    boolean isEmpty(){
      if(top==null)
        return true;
      else
        return false;
    }
    public void push(int data){
      Node n = new Node(data);
      n.next=top;
      top=n;
    }
    public int pop(){
      if(isEmpty()){
        System.out.println("Stack underflow");
        return -1;
      }
      else{
        int x=top.data;
        top=top.next;
        return x;
      }
    }
    public int peek(){
      if(isEmpty()){
        System.out.println("Stack underflow");
        return -1;
      }
      else{
        int x=top.data;
        return x;
      }
    }
      public static void main(String[] args) {
        Stack2 s = new Stack2();
        System.out.println(s.pop());
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        s.push(40);
      }
  }
  