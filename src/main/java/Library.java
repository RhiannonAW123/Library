import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library (int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook(Book book){
        this.books.remove(book);
        return book;
    }
}
