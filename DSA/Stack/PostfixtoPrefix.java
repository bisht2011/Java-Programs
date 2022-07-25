import java.util.Scanner;
import java.util.Stack;

public class PostfixtoPrefix {

        public static void main(String[] args) {
            String postfix;
            System.out.print("\nEnter the postfix expression you want to convert: ");
            postfix = new Scanner(System.in).nextLine();
            //output as postfix
            System.out.println("Postfix expression for the given infix expression is:" + prefix(postfix));
        }

        private static String prefix(String postfix) {
            Stack<String> stack = new Stack<>();
            for(int i= postfix.length()-1;i>=0;i--){
                char Symbol = postfix.charAt(i);
                if(isOperator(Symbol)){
                    String a=stack.pop();
                    String b=stack.pop();
                    stack.push("(" + a +b + Symbol+")");
                } else  {
                    stack.push(Symbol+"");
                }
            }
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

