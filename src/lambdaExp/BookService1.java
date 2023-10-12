package lambdaExp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService1 {
    List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService1().getBooksInSort());
    }
}

