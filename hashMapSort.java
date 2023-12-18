import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class hashMapSort {

    public Map<Integer,book> sortByPrice(Map<Integer,book> m){
        List <Map.Entry<Integer,book>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,book>>() {

            @Override
            public int compare(Entry<Integer, book> o1, Entry<Integer, book> o2) {
                return o1.getValue().getPrice().compareTo(o2.getValue().getPrice());
            }
            
        });
        LinkedHashMap<Integer, book> afterSortedMap = list.stream()
        .collect(Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue,
                (e1,e2) -> e2,
                LinkedHashMap::new
        ));
        return afterSortedMap;
    } 
}
