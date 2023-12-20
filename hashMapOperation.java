import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapOperation extends bookDataInHashMap{
    private static bookDataInHashMap dataInHashMap = new bookDataInHashMap();

    //add operation
    public void addData(Integer num, Book value){
            dataInHashMap.addDataInToHashmap(num, value);
    }

    //remove operation by key
    public void removeDataByKey(int num){
        Iterator<Integer> it = dataInHashMap.getAhashmap().keySet().iterator();
        if (num > 0) {
            while (it.hasNext()) {
            int key = it.next();
            Book value = dataInHashMap.getAhashmap().get(key);
            if (key == num) {
                it.remove();
                System.out.println("Removed  " + key + " and " + value );
                return;
            }
        }
        System.out.println("Key not found");
        }else{
            System.out.println("Key must be bigger than zero");
        }
    }

    //remove operation by value
    public void removeDataByValue(Book value){
        Iterator<Integer> it = dataInHashMap.getAhashmap().keySet().iterator();
        if (value != null) {
            while (it.hasNext()) {
            int key = it.next();
            Book valueByKey = dataInHashMap.getAhashmap().get(key);
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
    public Map<Integer,Book> searchDataByKey(int num){
        Iterator<Integer> it = dataInHashMap.getAhashmap().keySet().iterator();
        if (num > 0) {
            while (it.hasNext()) {
            int key = it.next();
            Book value = dataInHashMap.getAhashmap().get(key);
            if (key == num) {
                System.out.println("Searched  " + key + " and " + value );
                Map <Integer,Book> tempMap = new HashMap<>();
                tempMap.put(key, value);
                return tempMap;
            }
        }      
            System.out.println("Key not found");
        }else{
            System.out.println("Key must be bigger than zero");
        }
            return null;
    }

    //search operation by value
    public Map<Integer,Book> searchDataByValue(Book value){
        Iterator<Integer> it = dataInHashMap.getAhashmap().keySet().iterator();
        if (value != null) {
            while (it.hasNext()) {
            Integer key = (Integer)it.next();
            Book value2 = dataInHashMap.getAhashmap().get(key);
            if (value == value2) {
                System.out.println("Searched  " + key + " and " + value );
                Map <Integer,Book> tempMap = new HashMap<>();
                tempMap.put(key, value2);
                return tempMap;
            }
        }
            System.out.println("Value not found");        

        }else{
            System.out.println("Value cannot be null");
        }
        return null;
    }

    //change value in the hashmap
    //param need to pass key where the value need to change 
    public void changeValueInHashMap(Integer key, Book value){
        if (key <= 0) {
            System.out.println("Invalid key");
            return;
        }else if (value == null){
            System.out.println("Invalid value");
            return;

        }else{
          Iterator  <?> it = dataInHashMap.getAhashmap().entrySet().iterator();
          while (it.hasNext()) {
            //Map.Entry is a return type of entry set
            Map.Entry<Integer,Book> entry = (Map.Entry<Integer,Book>)it.next();
            if (key == entry.getKey()) {
                System.out.println("Changed "  + entry.getValue()+ " to " + value);
                entry.setValue(value);
                return;
            }
          }
          System.out.println("Key not found in HashMap keyset");
        }

    }


}

