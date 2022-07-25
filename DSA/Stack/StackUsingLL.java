import java.util.Scanner;

public class StackUsingLL {
    static int size;
    private static Node head = null;
    private static Node tail = null;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    static void push(int x) {
        Node newnode = new Node(x);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;

        }
        size++;
    }

    static int pop() {
        int data = 0;
        if (head == null) {
            System.out.println("empty stack");
        } else {
            data = head.data;
            head = head.next;
        }
        size--;
        return data;
    }

    static void peek() {
        System.out.println(head.data);
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("data is: " + temp.data);
            temp = temp.next;
        }
    }

    static void search(int x) {

        Node newnode = new Node(x);
        tail = head;
        while (tail != null) {

            if (tail.data == x) {
                System.out.println("found");
                break;
            }

            tail = tail.next;
        }
        if (tail == null) {
            System.out.println("not found");
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

    static void max() {
        tail = head;
        int max = head.data;
        while (tail != null) {
            if (tail.data > max) {
                max = tail.data;
            }
            tail = tail.next;
        }
        System.out.println("max element is:" + max);
    }

    static void min() {
        tail = head;
        int min = head.data;
        while (tail != null) {
            if (tail.data < min) {
                min = tail.data;
            }
            tail = tail.next;
        }
        System.out.println("max element is:" + min);
    }
}
