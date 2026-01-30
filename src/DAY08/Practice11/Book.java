package DAY08.Practice11;

public class Book {

    String title;
    String author;

    Book(String title , String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
