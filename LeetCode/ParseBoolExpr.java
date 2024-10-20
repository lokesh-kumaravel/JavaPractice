package LeetCode;

import java.util.Stack;

public class ParseBoolExpr {
    public static void main(String[] args) {
        String expression = "|(&(t,f,t),!(t))"; 
        Stack<Character> st = new Stack<>();
        for (char currChar : expression.toCharArray()) {
            if (currChar == ',' || currChar == '(')
                continue; 
            if (currChar == 't' || currChar == 'f' || currChar == '!' || currChar == '&' || currChar == '|') {
                st.push(currChar);  
            } 
            else if (currChar == ')') {
                boolean hasTrue = false, hasFalse = false;
                while (st.peek() != '!' && st.peek() != '&' && st.peek() != '|') {
                    char topValue = st.pop();
                    if (topValue == 't')
                        hasTrue = true;  
                    if (topValue == 'f')
                        hasFalse = true; 
                }

                char op = st.pop();  
                if (op == '!') {
                    st.push(hasTrue ? 'f' : 't'); 
                } else if (op == '&') {
                    st.push(hasFalse ? 'f' : 't');
                } else {
                    st.push(hasTrue ? 't' : 'f'); 
                }
            }
        }
        boolean result = st.peek() == 't';
        System.out.println("The result of the boolean expression is: " + result);
    }
}
