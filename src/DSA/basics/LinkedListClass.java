package DSA.basics;

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int i) {
        this.val = i;
    }
}
public class LinkedListClass {
    public static ListNode insertBeforeTail(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        if(head == null){
            head = newNode;
            newNode.prev=  newNode.prev = null;
        }
        if(head.next == null){
            newNode.next = head.next;
            head.next.prev = newNode;
            newNode.prev = head;
            return head;
        }
        ListNode temp  = head;
        while(temp.next != null){
            temp = temp.next;
        }
        ListNode prev = temp.prev;
        prev.next.prev = newNode;
        newNode.next = prev.next;
        newNode.prev = prev;
        prev.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode one = new ListNode(10);
        ListNode two = new ListNode(15);
        ListNode three = new ListNode(25);

        head.next = one;
        head.prev = null;
        one.next = two;
        one.prev = head;
        two.prev = one;
        two.next = three;
        three.prev= two;
        three.next = null;

        insertBeforeTail(head , 20);

        System.out.println(head);

    }

    private static ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        ListNode newNode = new ListNode(X);
        ListNode temp  = head ;
        if(K == 1){
            newNode.next = head ;
            newNode.prev= null;
            head.prev = newNode;
            head = newNode;
            return head;
        }
        while(temp.next!= null){
            K--;
            if(K == 0){
                break;
            }
            temp = temp.next ;
        }
        ListNode prev  = temp.prev;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = temp;
        temp.prev = newNode;
        return head;
    }

    public static void insertBeforeGivenNode(ListNode node, int X) {
        ListNode newNode  = new ListNode(X);
        ListNode prev = node.prev;
        if(prev == null){
            newNode.prev = null;
            newNode.next  = node;
        }
        prev.next  = newNode;
        newNode.prev  = prev;
        newNode.next = node;
        node.prev = newNode;
    }
}
