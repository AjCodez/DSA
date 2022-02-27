import java.util.*;
class Node1 {
    char data;
    Node1 next;
  
    Node1(char data) {
      this.data = data;
    }
  }
  
  class Stack3 {
    Node1 top;
  
    boolean isEmpty() {
      if (top == null)
        return true;
      else
        return false;
    }
  
    public void push(char data) {
      Node1 n = new Node1(data);
      n.next = top;
      top = n;
    }
  
    public char pop() {
      if (isEmpty()) {
        System.out.println("Stack underflow");
        return ' ';
      } else {
        char x = top.data;
        top = top.next;
        return x;
      }
    }
  
    public char peek() {
      if (isEmpty()) {
        System.out.println("Stack underflow");
        return ' ';
      } else {
        char x = top.data;
        return x;
      }
    }
  }
  
public class ReverseString {

    public static void main(String[] args) {
       Stack3 st = new Stack3();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            char c = st.pop();
            System.out.print(c);
        }
        sc.close();
        
    }
}