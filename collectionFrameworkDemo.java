import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class collectionFrameworkDemo{
    private static  List <Object> aArraylist = new ArrayList<>();
    private static  List <Object> aLinkedlist = new LinkedList<>();
    private static  Set  <Object> aHashset = new HashSet<>();
    private static  Set  <Object> aLinkedHashset = new LinkedHashSet<>();
    private static  Set  <book> aTreeset = new TreeSet<>();
    private static  Map  <Integer,String> aHashmap = new HashMap<>();
    private static  Map  <Integer,String> aLinkedHashmap = new LinkedHashMap<>();
    private static  Map  <Integer,String> atreeMap = new TreeMap<>();
    //omg here i didn't add book inside maybe this is the reason

    

    public static List<Object> getAarraylist() {
        return aArraylist;
    }

    public static List<Object> getAlinkedlist() {
        return aLinkedlist;
    }

    public static Set<Object> getAhashset() {
        return aHashset;
    }

    public static Set<book> getAtreeset() {
        return aTreeset;
    }
    public static Set<Object> getAlinkedhashset() {
        return aLinkedHashset;
    }

    public static Map<Integer, String> getAhashmap() {
        return aHashmap;
    }

    public static Map<Integer, String> getAlinkedhashmap() {
        return aLinkedHashmap;
    }

    public static Map<Integer, String> getAtreemap() {
        return atreeMap;
    }
    
    public void setAarraylist(Object value) {
        aArraylist.add(value);
    }

    public void setaLinkedlist(Object value) {
        aLinkedlist.add(value);
    }


    public void setaHashset(Object value) {
        aHashset.add(value);
    }

    public void setaLinkedHashset(Object value) {
        aLinkedHashset.add(value);
    }

    public void setaHashmap(Integer num,String value){
        aHashmap.put(num, value);
    }

    public void setLinkedHashmap(Integer num,String value){
        aLinkedHashmap.put(num, value);
    }

    public void setaTreemap(Integer num,String value){
        atreeMap.put(num, value);
    }

    public void setaTreeset(book b){
        aTreeset.add(b);
    }
    //here i add book data method 

    
}

class book implements Comparable<book>{
    private String name;
    private Double price;
    
    public book(String string, Double valueOf) {
    }

    public String getName() {
        return name;
    }
    public void setName(String name,Double price) {
        this.name = name;
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "book [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(book o) {
       return Double.compare(this.price, o.price) ;
    }
   
}