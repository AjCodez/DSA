import java.util.*;

public class BracketsCheck {

    public static boolean open(char c){
        if(c=='[' || c=='(' || c=='{')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(open(c))
                st.push(c);
            else if(st.isEmpty()){
                System.out.println("Not balanced");
                    System.exit(0);
            }
            else{
                if((c==')' && st.peek()=='(') || (c==']' && st.peek()=='[') || (c=='}' && st.peek()=='{'))
                    st.pop();
                else{
                    System.out.println("Not balanced");
                    System.exit(0);
                }
            }
        }
        System.out.println("Balanced");
        sc.close();
    }
}