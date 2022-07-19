import java.util.Scanner;
public class SinglyLinkedList {

    int size;
   private node head = null;
   private node tail = null;
    public SinglyLinkedList(){
        this.size=0;
    }
   private  class node {
       private int data;
       private node next;

        public node(int data) {
            this.data = data;
        }
       public node(int val, node next) {
           this.data = val;
           this.next = next;
       }
    }
    public void InsertAtFirst(int data) {
        //Create a new node
        node newNode = new node(data);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size++;
        }
    public void InsertAtLast(int data) {
        if (head == null) {
            InsertAtFirst(data);

        } else {
            node newNode = new node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    public void insert(int val, int index) {
        if (index == 0) {
           InsertAtFirst(val);
            return;
        }
        if (index == size) {
            InsertAtLast(val);
            return;
        }

        node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        node newNode = new node(val, temp.next);
        temp.next = newNode;

        size++;
    }
    int deletionAtFirst(){
int data= head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
return data;
    }
int deletionAtLast(){
    int data= tail.data;
        if(head==null)
        {
            System.out.println(("no data"));
        }
        else {
            tail = head;
            while (tail.next.next != null) {
                tail = tail.next;
            }
                node temp = tail;
                tail.next = null;
                temp = null;
        }
        size--;
        return data;
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
    public void display() {
        //Node current will point to head
        node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("end");
    }
void search(int val){
        node temp=head;
    node newNode = new node(val);
    int count=0;

    while(temp!=null){
        count++;
        if(val==temp.data){
            System.out.println("found:" + count);
            break;
        }
        temp=temp.next;
    }
    if(count==0){
        System.out.println("not found");
    }
}
void Reverse() {
    node prev = null;
    node current = head;
    node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
    display();
}
    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();
        Scanner scan = new Scanner(System.in);
int ch=0;
int num;
while(ch!=10){
    System.out.println("enter your choice\n 1.addAtFirst 2.addAtLast 3.insertAtPoS 4.deletionAtFirst 5.DeletionAtLast 6.display 7.search 8.reverse 9.Sorting 10.exit");
    ch= scan.nextInt();
    switch (ch) {
        case 1 -> {
            System.out.println("enter the value");
            sList.InsertAtFirst(num = scan.nextInt());
        }
        case 2 -> {
            System.out.println("enter the value");
            sList.InsertAtLast(num = scan.nextInt());
        }
        case 3 -> {
            int index;
            System.out.println("enter the value and index");
            sList.insert(num= scan.nextInt(),index= scan.nextInt());
        }
        case 4 -> {
            System.out.println(sList.deletionAtFirst());
        }
        case 5 -> {
            System.out.println(sList.deletionAtLast());
        }

        case 6 -> {
            sList.display();
        }
        case 7 -> {
            System.out.println("enter the value you want to search");
            sList.search(num= scan.nextInt());
        }
        case 8->{
            System.out.println("reversed order");
            sList.Reverse();
        }
        case 9->{
            System.out.println("sorted order");
            sList.Sorting();
        }
        case 10 -> {
            System.out.println("thankyou");
            System.exit(0);
        }
    }
}

    }
}