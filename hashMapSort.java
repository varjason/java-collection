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

    public Map<Integer,Book> sortByPrice(Map<Integer,Book> m){
        List <Map.Entry<Integer,Book>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list,(o1,o2)-> o1.getValue().getPrice().compareTo(o2.getValue().getPrice()));
            
        LinkedHashMap<Integer, Book> afterSortedMap = list.stream()
        .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue,
                (e1,e2) -> e2,
                LinkedHashMap::new
        ));
        return afterSortedMap;
    } 

    public Map<Integer,Book>sortByAuthor(Map<Integer,Book> m){
        List<Map.Entry<Integer,Book>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list, (o1,o2) -> o1.getValue().getAuthor().compareTo(o2.getValue().getAuthor()));

        Map<Integer,Book>afterSortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer,Book> entry : list) {
            afterSortedMap.put(entry.getKey(), entry.getValue());
        }
        return afterSortedMap;
    }

    public Map<Integer,Book>sortByKey(Map<Integer,Book> m){
        Map<Integer,Book> afterSortedMap = new TreeMap<>((o1,o2) -> o2 - o1);
        for (Map.Entry<Integer,Book> s : m.entrySet()) {
            afterSortedMap.put(s.getKey(), s.getValue());   
        }
        return afterSortedMap;
    }
    
}
