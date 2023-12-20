import java.util.HashMap;
import java.util.Map;

public class bookDataInHashMap{
    private static  Map  <Integer,Book> aHashmap = new HashMap<>();

    public Map<Integer, Book> getAhashmap() {
        return aHashmap;
    }

    public void addDataInToHashmap(Integer num,Book value){
        aHashmap.put(num, value);
    }
}

