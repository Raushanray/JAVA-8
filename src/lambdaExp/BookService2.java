package lambdaExp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Lambda expression
public class BookService2 {
    List<Book> getBooksInSort1(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService2().getBooksInSort1());
    }
}
