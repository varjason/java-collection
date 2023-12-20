public class runHashMap {
    public static void main(String[] args) {
        hashMapOperation hashmapoperation = new hashMapOperation();
        hashMapSort hashmapsort = new hashMapSort();
        
        Book b1 = new Book("Make Your First Billion ", 12.99,"David");
        Book b2 = new Book("Be a pro programer ", 8.99,"Josh");
        Book b3 = new Book("Fall in love that summer ", 11.99,"Murphy");
        Book b4 = new Book("What rich people thinking ", 10.99,"Keanu");
        Book b5 = new Book("How to make your life happier ", 5.99,"Dennis");
        Book b6 = new Book("New Book ", 5.99,"Nolan");

        hashmapoperation.addData(1, b1);
        hashmapoperation.addData(2, b2);
        hashmapoperation.addData(3, b3);
        hashmapoperation.addData(4, b4);
        hashmapoperation.addData(5, b5);
        // hashmapoperation.removeDataByKey(1);
        // hashmapoperation.removeDataByValue(b5);
        // System.out.println(hmo.getAhashmap().toString());
        // hashmapoperation.searchDataByKey(-1);
        // hashmapoperation.searchDataByValue(null);
        hashmapoperation.changeValueInHashMap(8, b6);
        System.out.println(hashmapoperation.getAhashmap().toString());

        System.out.println(hashmapsort.sortByPrice(hashmapoperation.getAhashmap()));
        System.out.println(hashmapsort.sortByAuthor(hashmapoperation.getAhashmap()));
        System.out.println(hashmapsort.sortByKey(hashmapoperation.getAhashmap()));

    }
}
