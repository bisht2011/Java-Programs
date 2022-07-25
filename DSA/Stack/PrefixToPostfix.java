import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String prefix;
        System.out.print("\nEnter the prefix expression you want to convert: ");
        prefix = new Scanner(System.in).nextLine();
        //output as postfix
        System.out.println("Postfix expression for the given infix expression is:" + postfix(prefix));
    }

    private static String postfix(String prefix) {
        Stack<String> stack = new Stack<>();
for(int i= prefix.length()-1;i>=0;i--){
    char Symbol = prefix.charAt(i);
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
