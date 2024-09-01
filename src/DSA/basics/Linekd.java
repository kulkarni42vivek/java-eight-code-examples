package DSA.basics;


public class Linekd {
    public static void main(String[] args) {
        ListNode head  = new ListNode(25);
        ListNode one = new ListNode(30);
        ListNode two = new ListNode(35);
        ListNode three = new ListNode(40);
        head.next = one; one.next = two ; two.next = three; three.next = null;
        insertBeforeX(head , 35,32);
    }

    public static ListNode insertBeforeX(ListNode head, int X, int val) {
        ListNode temp  = head ;
        ListNode newNode = new ListNode(val);
        ListNode prevNode = head;
        while(temp.next != null){
            if(temp.val == X){
                break;
            }
            prevNode = temp;
            temp = temp.next;
        }
        if(prevNode == null){
            newNode.next  = head ;
            head  = newNode;
            return head ;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        return head;
    }
}
