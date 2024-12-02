package Trees;
class Node{
    int value ;
    Node left ;
    Node right ;
    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
public class LevelOrderTraversals {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printLevelOrder(root);
    }

    private static void printLevelOrder(Node root) {
        int height = getHeight(root);
        System.out.println(height);
        for(int i = 1;i<=height;i++){
            printOrders(root, i);
            System.out.println();
        }
    }

    private static void printOrders(Node root, int i) {
        if(root == null){
            return ;
        }
        if(i ==1){
            System.out.print(root.value);
        }
        else {
            printOrders(root.left, i - 1);
            printOrders(root.right, i - 1);
        }
    }

    private static int getHeight(Node root) {
        if(root == null){
            return 0;
        }
        int lheight = getHeight(root.left);
        int rheight = getHeight(root.right);
        return Math.max(lheight , rheight)+1;
    }
}
