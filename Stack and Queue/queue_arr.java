public class queue_arr {
  static int front, rear, cap;
  static int q[];

  queue_arr(int c) {
    front = 0;
    rear = 0;
    cap = c;
    q = new int[cap];
  }

  public boolean isEmpty() {
    if (rear == front)
      return true;
    else
      return false;
  }

  public boolean isFull() {
    if (rear == cap)
      return true;
    else
      return false;
  }

  public void enqueue(int data) {
    if (isFull())
      System.out.println("Queue is full");
    else {
      q[rear] = data;
      rear++;
    }
  }

  public int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      int x = q[front];
      for (int i = 0; i < rear - 1; i++)
        q[i] = q[i + 1];

      rear--;
      q[rear] = 0;
      return x;
    }
  }

  public int front() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      return q[front];
    }
  }

  public int rear() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    } else {
      return q[rear];
    }
  }

  public static void main(String[] args) {
    queue_arr q1 = new queue_arr(4);
    System.out.println(q1.dequeue());
    q1.enqueue(10);
    q1.enqueue(20);
    System.out.println(q1.dequeue());
    q1.enqueue(30);
    q1.enqueue(40);
    System.out.println(q1.front());
    System.out.println(q1.rear());
    q1.enqueue(50);
    q1.enqueue(60);
    System.out.println(q1.dequeue());
  }
}
