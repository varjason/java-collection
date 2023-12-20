class Book {
    private String name;
    private Double price;
    private String author;

    public Book(String string, double d,String author) {
        this.name = string;
        this.price = d;
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public void setName(String name,Double price,String author) {
        this.name = name;
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "book name : " + name + ", book price : " + price + ", author : " + author +" \n" ;
    }
   
}