public class Stack1 {
    static final int max = 5;
    int arr[] = new int[max];
    int top;

    Stack1() {
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (top >= (max - 1))
            return true;
        else
            return false;
    }

    public void push(int x) {
        if (isFull())
            System.out.println("Stack overflow");
        else {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int x = arr[top];
            top--;
            return x;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int x = arr[top];
            return x;
        }
    }

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        System.out.println(s.pop());
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);
        System.out.println(s.peek());
        s.push(40);
    }
}
