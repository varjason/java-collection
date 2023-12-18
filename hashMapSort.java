import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hashMapSort {

    public Map<Integer,book> sortByPrice(Map<Integer,book> m){
        List <Map.Entry<Integer,book>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list,(o1,o2)-> o1.getValue().getPrice().compareTo(o2.getValue().getPrice()));
            
        LinkedHashMap<Integer, book> afterSortedMap = list.stream()
        .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue,
                (e1,e2) -> e2,
                LinkedHashMap::new
        ));
        return afterSortedMap;
    } 

    public Map<Integer,book>sortByAuthor(Map<Integer,book> m){
        List<Map.Entry<Integer,book>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,book>>() {

            @Override
            public int compare(Entry<Integer, book> o1, Entry<Integer, book> o2) {
                return o1.getValue().getAuthor().compareTo(o2.getValue().getAuthor());
            }
            
        });

        Map<Integer,book>afterSortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer,book> entry : list) {
            afterSortedMap.put(entry.getKey(), entry.getValue());
        }
        return afterSortedMap;
    }

    public Map<Integer,book>sortByKey(Map<Integer,book> m){
        Map<Integer,book> afterSortedMap = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });
        for (Map.Entry<Integer,book> s : m.entrySet()) {
            afterSortedMap.put(s.getKey(), s.getValue());   
        }
        return afterSortedMap;
    }
    
}
