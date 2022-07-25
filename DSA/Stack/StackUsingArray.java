import java.util.*;
public class StackUsingArray {
    static int[] stack = new int[5];
    static int top = -1;

    static void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("stack is full");
        } else {
            stack[++top] = x;
        }
    }

    static int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    static void peek() {
        System.out.println(stack[top]);
    }

    static void display() {
        int i;
        for (i = top; i >= 0; i--) {
            System.out.println(("Data is " + stack[i]));
        }
    }

    static void search(int x) {
        int i = top;
        while (i != -1) {
            if (stack[i] == x) {
                System.out.println("found at index" + i);
                break;
            }
            i--;
            if (i == 0) {
                System.out.println(("\nEntered elementis not found\n"));
            }
        }
    }

    public static void main(String[] args) {
        int choice;
        int going = 1;
        while (true) {
            System.out.println("enter the choice \n 1.push 2.pop 3.peek 4.display 5.search 6.max element 7. min element 8.exit");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("enter the value");
                    int num = new Scanner(System.in).nextInt();
                    push(num);
                }
                case 2 -> {
                    System.out.println(pop());
                }
                case 3 -> {
                    peek();
                }
                case 4 -> {
                    display();
                }
                case 5 -> {
                    System.out.println("enter the element you want to search");
                    int num = new Scanner(System.in).nextInt();
                    search(num);
                }
                case 6 -> {
                    max();
                }
                case 7->{
                    min();
                }
                case 8 -> {
                    System.out.println(("thankyou"));
                    System.exit(0);
                }
            }

        }
    }

    private static void max() {
        int max;
        max=stack[top];
        for(int i=top-1; i>=0; i--){
            if (stack[i]>max){
                max=stack[i];
            }
        }
        System.out.println("max element is :" + max);

    }
    private static void min() {
        int min;
        min=stack[top];
        for(int i=top-1; i>=0; i--){
            if (stack[i]<min){
                min=stack[i];
            }
        }
        System.out.println("min element is :" + min);

    }
}