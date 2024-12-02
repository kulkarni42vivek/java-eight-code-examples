package DoublyLinkedList;

class Node{
    int data ;
    Node prev;
    Node next;
}
public class DoublyLinkedList {
    Node head ;
    Node tail;

    public DoublyLinkedList(){
        head  = null ;
        tail = null ;
    }

    public void addNode(int value){
        Node newnode  = new Node();
        newnode.data = value ;
        newnode.next = null ;
        newnode.prev = null;
        if(head  == null ){
            head = tail  = newnode;
        }
        else{
            tail.next  = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void printListFromStart(){
        Node temp  = head ;
        while(temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void printListFromEnd(){
        Node temp  = tail ;
        while(temp != null ){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
