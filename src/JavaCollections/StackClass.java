package JavaCollections;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("asdf");
        stack.add("ew");
        stack.add("8we");
        stack.add("erw");
        System.out.println(stack.toString());
        Iterator<String> stritr = stack.iterator();
        while(stritr.hasNext()){
            System.out.println(stritr.next());
        }
    }
}
