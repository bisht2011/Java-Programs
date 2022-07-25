import java.io.*;
import java.util.Scanner;

class Stack1
{
    char[] a=new char[100];
    int top=-1;
    void push(char c)
    {
            a[++top]= c;

    }
    char pop()
    {
        return a[top--];
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    char peek()
    {
        return a[top];
    }
}
public class InfixToPostfix
{
    static Stack1 operators = new Stack1();
    public static void main(String[] argv)
    {
        String infix;

        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = new Scanner(System.in).nextLine();
        //output as postfix
        System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
    }
    private static String toPostfix(String infix)
    //converts an infix expression to postfix
    {
        char symbol;
        StringBuilder postfix = new StringBuilder();
        for(int i=0;i<infix.length();++i)
        //while there is input to be read
        {
            symbol = infix.charAt(i);
            //if it's an operand, add it to the string
            if (Character.isLetter(symbol))
                postfix.append(symbol);
            else if (symbol=='(')
            //push (
            {
                operators.push(symbol);
            }
            else if (symbol==')')
            //push everything back to (
            {
                while (operators.peek() != '(')
                {
                    postfix.append(operators.pop());
                }
                operators.pop();        //remove '('
            }
            else
            //print operators occurring before it that have greater precedence
            {
                while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))
                    postfix.append(operators.pop());
                operators.push(symbol);
            }
        }
        while (!operators.isEmpty())
            postfix.append(operators.pop());
        return postfix.toString();
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