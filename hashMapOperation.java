import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapOperation extends hashMapStoringData{
    private static hashMapStoringData hmsd = new hashMapStoringData();

    //add operation
    public void addData(Integer num, book value){
            hmsd.addDataInToHashmap(num, value);
    }

    //remove operation by key
    public void removeDataByKey(Integer num){
        Iterator<Integer> it = hmsd.getAhashmap().keySet().iterator();
        if (num != null) {
            while (it.hasNext()) {
            Integer key = (Integer)it.next();
            book value = hmsd.getAhashmap().get(key);
            if (key == num) {
                it.remove();
                System.out.println("Removed  " + key + " and " + value );
                return;
            }
        }
        System.out.println("Key not found");
        }else{
            System.out.println("Key cannot be null");
        }
    }

    //remove operation by value
    public void removeDataByValue(book value){
        Iterator<Integer> it = hmsd.getAhashmap().keySet().iterator();
        if (value != null) {
            while (it.hasNext()) {
            Integer key = (Integer)it.next();
            book valueByKey = hmsd.getAhashmap().get(key);
            if (valueByKey == value) {
                it.remove();
                System.out.println("Removed  " + key + " and " + value );
                return;
            }
        }
        System.out.println("Value not found");
        }else{
            System.out.println("Value cannot be null");
        }
    }

    //search operation by key
    public Map<Integer,book> searchDataByKey(Integer num){
        Iterator<Integer> it = hmsd.getAhashmap().keySet().iterator();
        if (num != null) {
            while (it.hasNext()) {
            Integer key = (Integer)it.next();
            book value = hmsd.getAhashmap().get(key);
            if (key == num) {
                System.out.println("Searched  " + key + " and " + value );
                Map <Integer,book> tempMap = new HashMap<>();
                tempMap.put(key, value);
                return tempMap;
            }
        }
        }
        System.out.println("Key not found");
        return null;
    }

    //search operation by value
    public Map<Integer,book> searchDataByValue(book value){
        Iterator<Integer> it = hmsd.getAhashmap().keySet().iterator();
        if (value != null) {
            while (it.hasNext()) {
            Integer key = (Integer)it.next();
            book value2 = hmsd.getAhashmap().get(key);
            if (value == value2) {
                System.out.println("Searched  " + key + " and " + value );
                Map <Integer,book> tempMap = new HashMap<>();
                tempMap.put(key, value2);
                return tempMap;
            }
        }
        }
        System.out.println("Value not found");        
        return null;
    }

    //change value in the hashmap
    //param need to pass key where the value need to change 
    public void changeValueInHashMap(Integer key, book value){
         Iterator  it = hmsd.getAhashmap().entrySet().iterator();
          while (it.hasNext()) {
    //Map.Entry is a return type of entry set
            Map.Entry<Integer,book> entry = (Map.Entry<Integer,book>)it.next();
            if (key == entry.getKey()) {
                System.out.println("Changed "  + entry.getValue()+ " to " + value);
                entry.setValue(value);
            }
          }
    }


}

