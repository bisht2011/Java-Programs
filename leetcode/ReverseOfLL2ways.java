public class ReverseOfLL2ways {
    static ListNode tail;
    public void reversebyrecusrion(ListNode head){
        if(tail==head){
            head=tail;
            return;
        }
        reversebyrecusrion(head.next);
        tail.next=head;
        tail=head;
        tail.next=null;
    }
    public void reversebyiteration(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }
}
