package DoublyLinkedList;

public class Operations {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNode(20);
        dll.addNode(12);
        dll.addNode(11);
        dll.addNode(8);
        dll.addNode(9);
        dll.addNode(13);

        dll.printListFromStart();

        System.out.println( );
        dll.printListFromEnd();
    }
}
