public class runHashMap {
    public static void main(String[] args) {
        hashMapOperation hmo = new hashMapOperation();
        hashMapSort hms = new hashMapSort();
        
        book b1 = new book("Make Your First Billion ", 12.99,"David");
        book b2 = new book("Be a pro programer ", 8.99,"Josh");
        book b3 = new book("Fall in love that summer ", 11.99,"Murphy");
        book b4 = new book("What rich people thinking ", 10.99,"Keanu");
        book b5 = new book("How to make your life happier ", 5.99,"Dennis");
        book b6 = new book("New Book ", 5.99,"Nolan");

        hmo.addData(1, b1);
        hmo.addData(2, b2);
        hmo.addData(3, b3);
        hmo.addData(4, b4);
        hmo.addData(5, b5);
        // hmo.removeDataByKey(0);
        // hmo.removeDataByValue(b6);
        // System.out.println(hmo.getAhashmap().toString());
        // hmo.searchDataByKey(1);
        // hmo.searchDataByValue(null);
        // hmo.changeValueInHashMap(1, b6);
        // System.out.println(hmo.getAhashmap().toString());

        System.out.println(hms.sortByPrice(hmo.getAhashmap()));
        System.out.println(hms.sortByAuthor(hmo.getAhashmap()));


    }
}
