import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {

        String infix;
        System.out.print("\nEnter the infix expression you want to convert: ");
       infix = new Scanner(System.in).nextLine();
        //output as postfix
        System.out.println("Postfix expression for the given infix expression is:" + prefix(infix));
    }

    private static String prefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        StringBuilder rev = new StringBuilder(infix);
        rev.reverse();
        Stack<Character> stack = new Stack<Character>();
       char Symbol;

        for(int i=0;i<infix.length();i++){
            Symbol=rev.charAt(i);
            if(Symbol==')'){
                Symbol='(';
                i++;
            }
            else if (Symbol == '(') {
                Symbol = ')';
                i++;
            }
            if (Character.isLetter(Symbol))
                prefix.append(Symbol);
            else if (Symbol=='(')
            //push (
            {
                stack.push(Symbol);
            }
            else if (Symbol==')')
            //push everything back to (
            {
                while (stack.peek() != '(')
                {
                    prefix.append(stack.pop());
                }
                stack.pop();        //remove '('
            }
            else
            //print operators occurring before it that have greater precedence
            {
                while (!stack.isEmpty() && !(stack.peek()=='(') && prec(Symbol) <= prec(stack.peek()))
                    prefix.append(stack.pop());
                stack.push(Symbol);
            }
        }
        while (!stack.isEmpty())
            prefix.append(stack.pop());
        prefix.reverse();
        return prefix.toString();

}



    static int prec(char x)
    {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        if(x=='^')
            return 3;
        return 0;
    }
}
