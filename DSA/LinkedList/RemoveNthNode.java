public class RemoveNthNode {
    public static void main(String[] args) {

    }
    //first method
//    if(head == null)
//            return null;
//
//    //get length of list
//    ListNode p = head;
//    int len = 0;
//    while(p != null){
//        len++;
//        p = p.next;
//    }
//
//    //if remove first node
//    int fromStart = len-n+1;
//    if(fromStart==1)
//            return head.next;
//
//    //remove non-first node
//    p = head;
//    int i=0;
//    while(p!=null){
//        i++;
//        if(i==fromStart-1){
//            p.next = p.next.next;
//        }
//        p=p.next;
//    }
//
//    return head;
}
//second method
//    if(head == null)
//            return null;
//
//            ListNode fast = head;
//            ListNode slow = head;
//
//            for(int i=0; i<n; i++){
//        fast = fast.next;
//        }
//
//        //if remove the first node
//        if(fast == null){
//        head = head.next;
//        return head;
//        }
//
//        while(fast.next != null){
//        fast = fast.next;
//        slow = slow.next;
//        }
//
//        slow.next = slow.next.next;
//
//        return head;