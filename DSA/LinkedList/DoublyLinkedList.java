import java.util.Scanner;

public class DoublyLinkedList {
    int size;
    private node head;
    private node tail;

    public DoublyLinkedList() {
        this.size = 0;
    }

    private static class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
        }

        public node(int data, node next, node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void InsertAtFirst(int val) {
        node newnode = new node(val);
        if (head == null)
            head = tail = newnode;
        else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }
    public void InsertAtLast(int val) {
        if (head == null) {
            InsertAtFirst(val);
        } else {
            node newnode = new node(val);
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        size++;
    }

    public int DeletionAtFirst() {
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int DeletionAtLast() {
        int data = tail.data;
        if (head == null) {
            System.out.println(("no data"));
        } else {
            tail = head;
            while (tail.next.next != null) {
                tail = tail.next;
            }
            tail = tail.prev.next;
            tail.next = null;
        }
        size--;
        return data;
    }

    public void Insert(int data, int index) {
        if (index == 0) {
            InsertAtFirst(data);
            return;
        }
        if (index == size) {
            InsertAtLast(data);
            return;
        }

        node tail=head;
        int k=1;
        while(k!=index){
            tail=tail.next;
            k++;
        }
        node newnode = new node(data);
        tail=tail.next;
        newnode.next=tail;
        newnode.prev=tail.prev;
        tail.prev.next=newnode;
        size++;
    }

    public void search(int data) {
        node temp = head;
        node newnode = new node(data);
        int c = 0;
        while (temp != null) {
            c++;
            if (data == temp.data) {
                System.out.println("found at: " + c);
                break;
            }
            temp = temp.next;
        }
        if (c == 0)
            System.out.println("not found");
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }
public void Sorting(){
    node current = head, index = null;

    int temp;

    if (head == null) {
        return;
    }
    else {
        while (current != null) {
            // Node index will point to node next to
            // current
            index = current.next;

            while (index != null) {
                // If current node's data is greater
                // than index's node data, swap the data
                // between them
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

                index = index.next;
            }
            current = current.next;
        }
    }
    display();
}
void Reverse(){
        node temp=tail;
        while(tail!=null){
            System.out.print(tail.data+"->");
            tail=tail.prev;
        }
    System.out.println("start");
}
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        Scanner scan = new Scanner(System.in);
        int ch = 0;
        int num;
        while (ch != 10) {
            System.out.println("enter your choice\n 1.addAtFirst 2.addAtLast 3.insertAtPoS 4.deletionAtFirst 5.DeletionAtLast 6.display 7.search 8.sorting 9.reverse 10.exit");
            ch = scan.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("enter the value");
                    dlist.InsertAtFirst(num = scan.nextInt());
                }
                case 2 -> {
                    System.out.println("enter the value");
                    dlist.InsertAtLast(num = scan.nextInt());
                }
                case 3 -> {
                    int index;
                    System.out.println("enter the value and index");
                    dlist.Insert(num = scan.nextInt(), index = scan.nextInt());
                }
                case 4 -> {
                    System.out.println(dlist.DeletionAtFirst());
                }
                case 5 -> {
                    System.out.println(dlist.DeletionAtLast());
                }

                case 6 -> {
                    dlist.display();
                }
                case 7 -> {
                    System.out.println("enter the value you want to search");
                    dlist.search(num = scan.nextInt());
                }
                case 8 -> {
                    System.out.println("sorted :");
                    dlist.Sorting();
                }
                case 9 ->{
                    System.out.println("reversed order:");
                    dlist.Reverse();
                }
                case 10 -> {
                    System.out.println("thankyou");
                    System.exit(0);
                }
            }
        }
    }
}
