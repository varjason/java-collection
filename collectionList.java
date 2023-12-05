import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class collectionList {
    public static void main(String[] args) {
        List <String> aList = new ArrayList<>();
        aList.add("Hello ");
        aList.add("World");        

        //第一种for each
        for (String str : aList) {
            System.out.println("I am For Each : " + str);
        }

        //第二种for i
        for (int i = 0; i < aList.size(); i++) {
            System.out.println("I am For i : " + aList.get(i));
        }

        //第三种iterator
        Iterator it = aList.iterator();
        while (it.hasNext()) {
            System.out.println("I am Iterator : " + it.next());
        }
        //第四种for each lambda
        aList.forEach(t -> System.out.println("I am Lambda For Each : "+t));
        aList.forEach(System.out::println);
    } 
}
