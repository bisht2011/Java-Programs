import java.util.*;
    public class PostficToInfix {

        public static void main(String[] args) {

            String postfix;
            System.out.print("\nEnter the infix expression you want to convert: ");
            postfix = new Scanner(System.in).nextLine();
            //output as postfix
            System.out.println("Postfix expression for the given infix expression is:" + infix(postfix));
        }

        private static String infix(String postfix) {
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < postfix.length(); i++) {
                char ch = postfix.charAt(i);
//inside the if-statement we have called the user-defined function that checks whether the character is operator or not
                if (isOperator(ch)) {
                    String b = stack.pop();
                    String a = stack.pop();
//push the character (operator) into stack in between the string a and b
                    stack.push("(" + a + ch + b + ")");
                } else
//push character into the stack
                    stack.push("" + ch);
            }
//pop character from the stack and returns the same

            return stack.pop();
        }

        private static boolean isOperator(char ch) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
//returns true if either of the operator is found
                return true;
//else returns false
            return false;
        }
    }
