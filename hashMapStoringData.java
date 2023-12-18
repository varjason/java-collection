import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class collectionFrameworkDemo{
    private static  Set  <book> aHashset = new HashSet<>();
    private static  Map  <Integer,String> aHashmap = new HashMap<>();
    private static  Map  <Integer,String> atreeMap = new TreeMap<>();

    public static Set<book> getAhashset() {
        return aHashset;
    }


    public static Map<Integer, String> getAhashmap() {
        return aHashmap;
    }


    public static Map<Integer, String> getAtreemap() {
        return atreeMap;
    }

    public void setaHashset(book value) {
        aHashset.add(value);
    }

    public void setaHashmap(Integer num,String value){
        aHashmap.put(num, value);
    }

    public void setaTreemap(Integer num,String value){
        atreeMap.put(num, value);
    }
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