import java.util.LinkedList;

public class collectionLinkedListDemo {

    public static void main(String[] args) {
        //先进后厨
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        System.out.println(ll);

        LinkedList <Integer> ll2 = new LinkedList<>();
        ll2.push(1);
        ll2.push(2);
        ll2.push(3);
        System.out.println(ll2.pop());
        System.out.println(ll2.pop());
        System.out.println(ll2);
    }
}