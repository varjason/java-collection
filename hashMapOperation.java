import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class collectionFrameworkOperation extends collectionFrameworkDemo{
    public static void addData(Object value){
        collectionFrameworkDemo cfd = new collectionFrameworkDemo();
        cfd.setAarraylist(value);
        book b1 = new book("Java",Double.valueOf(2.99));
        book b2 = new book("Golang",Double.valueOf(1.99));
        book b3 = new book("Python",Double.valueOf(4.99));
        book b4 = new book("C++",Double.valueOf(3.99));
        //here i create a object for book and add data inside
        List <Object> l1 = new ArrayList<>();
        cfd.setaTreemap(1,"Java");
        cfd.setaTreeset(b2);
        cfd.setaTreeset(b3);
        cfd.setaTreeset(b4);
    }

    public static void printAnArraylist(){
        System.out.println(getAarraylist());
    }

     public static void printAnTreeset(){
        System.out.println(getAtreeset());
    }
}

