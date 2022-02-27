import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
       Stack<Character> st = new Stack<Character>();
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