class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
  }
  public class queue {
    Node front;
    Node rear;
    boolean isEmpty(){
      if(front==null)
        return true;
      else
        return false;
    }
    public void enqueue(int data){
      Node n = new Node(data);
      if(isEmpty()){
        front=n;
        rear=n;
      }
      else{
        front.next=n;
        front=n;
      }
    }
    public int dequeue(){
      if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
      }
      else{
        int x=rear.data;
        rear=rear.next;
        return x;
      }
    }
    public int front(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      else{
        int x=front.data;
        return x;
      }
    }
    public int rear(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }
      else{
        int x=rear.data;
        return x;
      }
    }
    public static void main(String[] args) {
        queue q = new queue();
        System.out.println(q.dequeue());
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
        q.enqueue(30);
        System.out.println(q.front());
        q.enqueue(40);
      }
  }
  