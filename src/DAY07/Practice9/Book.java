package DAY07.Practice9;

public class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void printBook(){
        System.out.printf("%s,%s,%d\n",title,author,price);
    }



}
