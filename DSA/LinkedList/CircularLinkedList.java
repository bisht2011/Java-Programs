import java.util.*;
public class CircularLinkedList {
    int size;
    private node head = null;
    private node tail = null;

    private class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;

        }
    }
        public void InsertAtFirst(int x) {
            node newnode = new node(x);
            if (head == null) {
                head = tail = newnode;
            } else {
                newnode.next = head;
                tail.next=newnode;
                head=newnode;

            }
            size++;
        }

    public void InsertAtLast(int x){
        if(head==null) {
            InsertAtFirst(x);
        }
        else{
            node newNode = new node(x);
            tail.next = newNode;
            newNode.next=head;
            tail = newNode;
        }
        size++;
    }
   public void Insert(int x,int index){
       if (index == 0) {
           InsertAtFirst(x);
           return;
       }
       if (index == size) {
           InsertAtLast(x);
           return;
       }
        int k=1;
        tail=head;
        while(k!=index){
            tail=tail.next;
            k++;
        }
        node newnode=new node(x);
        tail.next=newnode;
        size++;
   }
    public int DeletionAtFirst(){
        int data=head.data;
        head=head.next;
        tail.next=head;
        size--;
        return data;
    }
    public int DeletionAtLast(){
        int data=tail.data;
        tail=head;
        while(tail.next.next!=head){
            tail=tail.next;
        }
        node temp=tail;
        tail.next=head;
        size--;
        return data;
    }
    void Sorting(){
        node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current.next != head) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != head) {
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
    void search(int x){
        node temp=head;
        node newnode =new node(x);
        int f=0;

        do {
            if (temp.data == x) {
                System.out.println("element is present");
                f = 1;
                break;
            }
            temp = temp.next;
        } while (temp != head);
        if (f == 0) {
            System.out.println("element is not present");
        }
    }
    public void Reverse(){
        if (head == null)
        {
            System.out.print("Empty linked list");
            return;
        }
       node temp = head;
        node back = null;
        node curr = null;
        // (temp != null) for safety purpose
        // Iterating and reverse the linked list node
        while (temp != null && temp.next != head)
        {
            // Interchange the node link
            curr = temp;
            temp = temp.next;
            curr.next = back;
            back = curr;
        }
        // Attaching the first node, next field to last node
        head.next = temp;
        if (back != null)
        {
            temp.next = back;
        }
        // Make last node to head
        head = temp;
        display();
    }
   public void display(){
        if(head==null){
            System.out.println("empty\n");
        }
        node temp=head;
        do{
            System.out.print(temp.data + "->");
            temp=temp.next;
        }while (temp!=head);
       System.out.println("head");
    }

    public static void main(String[] args) {
        CircularLinkedList Clist = new CircularLinkedList();
        Scanner scan = new Scanner(System.in);
        int ch = 0;
        int num;
        while (ch != 10) {
            System.out.println("enter your choice\n 1.addAtFirst 2.addAtLast 3.insertAtPoS 4.deletionAtFirst 5.DeletionAtLast 6.display 7.search 8.sorting 9.reverse 10.exit");
            ch = scan.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("enter the value");
                    Clist.InsertAtFirst(num = scan.nextInt());
                }
                case 2 -> {
                    System.out.println("enter the value");
                    Clist.InsertAtLast(num = scan.nextInt());
                }
                case 3 -> {
                    int index;
                    System.out.println("enter the value and index");
                    Clist.Insert(num = scan.nextInt(), index = scan.nextInt());
                }
                case 4 -> System.out.println(Clist.DeletionAtFirst());
                case 5 -> {
                    System.out.println(Clist.DeletionAtLast());
                }

                case 6 -> {
                    Clist.display();
                }
                case 7 -> {
                    System.out.println("enter the value you want to search");
                    Clist.search(num = scan.nextInt());
                }
                case 8 -> {
                    System.out.println("sorted :");
                    Clist.Sorting();
                }
                case 9 -> {
                    System.out.println("reversed order:");
                    Clist.Reverse();
                }
                case 10 -> {
                    System.out.println("thankyou");
                    System.exit(0);
                }
            }
        }
    }
}